import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.ImageObserver;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * Clase que representa el escenario del juego donde tenemos que disparar a las naves alienigenas
 * @version 1.0, 
 * @author Alvaro Blanco
 */

public class Escenario extends JPanel{
	private Timer timer;
	private ImageIcon nave,bala,alienA,alienB;
	private ArrayList<ImageIcon> naveExplosion;
	private ArrayList<ImageIcon> alienExplosion;
	private Logica logica;
	private JFrame frame;
	
	long time,time1;
	
	int z;
	
	public Escenario(int nivel,JFrame f){
		frame=f;
		nave = new ImageIcon("nave.png");//carga imagen nave
		bala = new ImageIcon("bala.png");//carga imagen bala
		alienA = new ImageIcon("alienA.png");//carga imagen alienA
		alienB = new ImageIcon("alienB.png");//carga imagen alienB
		naveExplosion= new ArrayList<ImageIcon>();
		{
			naveExplosion.add(new ImageIcon("exp1.png"));
			naveExplosion.add(new ImageIcon("exp2.png"));
			naveExplosion.add(new ImageIcon("exp3.png"));
			naveExplosion.add(new ImageIcon("exp4.png"));
			naveExplosion.add(new ImageIcon("exp5.png"));
			naveExplosion.add(new ImageIcon("exp6.png"));
			naveExplosion.add(new ImageIcon("exp7.png"));
			naveExplosion.add(new ImageIcon("exp8.png"));
			naveExplosion.add(new ImageIcon("exp9.png"));
		}
		alienExplosion= new ArrayList<ImageIcon>();
		{
			alienExplosion.add(new ImageIcon("exp1a.png"));
			alienExplosion.add(new ImageIcon("exp2a.png"));
			alienExplosion.add(new ImageIcon("exp3a.png"));
			alienExplosion.add(new ImageIcon("exp4a.png"));
		}
		
		logica=new Logica(0,RType.ALTO/2,nivel);
		time=System.nanoTime();
		time1=System.nanoTime();
		setBackground(Color.BLACK);
		
		addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent arg1) {
				switch(arg1.getKeyCode()){
					case KeyEvent.VK_Q: 
						logica.getNave().setMoverArriba(true);
						break;
					case KeyEvent.VK_A: 
						logica.getNave().setMoverAbajo(true);
						break;
					case KeyEvent.VK_P: 
						logica.getNave().setMoverDcha(true);
						break;
					case KeyEvent.VK_O: 
						logica.getNave().setMoverIzq(true);
						break;
					case KeyEvent.VK_SPACE:
						if(System.nanoTime()-time>200000000.0f){
							logica.getNave().disparo(logica.getNave().getPosX(), logica.getNave().getPosY());
							time=System.nanoTime();
						}
						break;
					default:
						break;
					}
				}
			public void keyReleased(KeyEvent arg0){
				switch(arg0.getKeyCode()){
				case KeyEvent.VK_Q: 
					logica.getNave().setMoverArriba(false);
					break;
				case KeyEvent.VK_A: 
					logica.getNave().setMoverAbajo(false);
					break;
				case KeyEvent.VK_P: 
					logica.getNave().setMoverDcha(false);
					break;
				case KeyEvent.VK_O: 
					logica.getNave().setMoverIzq(false);
					break;
				default:
					break;
				}
			}
			});
		
		timer = new Timer (20, new ActionListener () 
        { 
           public void actionPerformed(ActionEvent e) 
            {       
        	   if(logica.getFin()){//realentiza el juego cuando hemos muerto para que se vea la explosi�n
	        	   if(System.nanoTime()-time1>80000000.0f){ 
		        		repaint(); //repaint the paintComponent
		   				time1=System.nanoTime();
	   				}
        	   }
        	   else{
		        		repaint(); //repaint the paintComponent

        	   }
               
            } 
        });
		timer.start();
		setFocusable(true);
	    requestFocus();
	}
	
	/**
	 * Este metodo se encarga del renderizado de la pantalla cada instante de tiempo.
	 */
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		if(logica.getFin())
			z=logica.getNave().spriteexplosion();
		
		if((!logica.getFin()||z>0) && !logica.getVictoria()){
			logica.bucleJuego();
			
			//dibuja la nave
			if(!logica.getFin())
				g.drawImage(nave.getImage(), logica.getNave().getPosX(), logica.getNave().getPosY(), null);
			else/*simula explosion nave*/
				g.drawImage(naveExplosion.get(z).getImage(), logica.getNave().getPosX()-NaveAliada.ANCHO_NAVE-40, logica.getNave().getPosY()-NaveAliada.ALTO_NAVE-10, null);

			//dibuja las balas
			for(int i=0;i<logica.getNave().numeroBalas();i++){
				g.drawImage(bala.getImage(), logica.getNave().consultarBala(i).getPosX(), logica.getNave().consultarBala(i).getPosY(), null);
			}
			//dibuja alienA
			for(int i=0;i<logica.numeroAlienA();i++){
				if(logica.getAlienA(i).getVive())
					g.drawImage(alienA.getImage(),logica.getAlienA(i).getPosX(), logica.getAlienA(i).getPosY(), null);
				else{
					if(logica.getAlienA(i).spriteexplosion()>=0)
						g.drawImage(alienExplosion.get(logica.getAlienA(i).getExplosion()).getImage(),logica.getAlienA(i).getPosX(), logica.getAlienA(i).getPosY(), null);
				}
			}
			
			//dibuja alienB
			for(int i=0;i<logica.numeroAlienB();i++){
				if(logica.getAlienB(i).getVive())
					g.drawImage(alienB.getImage(),logica.getAlienB(i).getPosX(), logica.getAlienB(i).getPosY(), null);
				else{
					if(logica.getAlienB(i).spriteexplosion()>=0)
						g.drawImage(alienExplosion.get(logica.getAlienB(i).getExplosion()).getImage(),logica.getAlienB(i).getPosX(), logica.getAlienB(i).getPosY(), null);
				}
			}
		}else{//acabo la partida
			frame.dispose();
			//si hemos ganado
			if(logica.getVictoria())
				new RType(-1);
			else //si hemos perdido
				new RType(-2);
			
			
		}
		
	}

}

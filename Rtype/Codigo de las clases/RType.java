import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

/**
 * Clase que extiende a JFrame y sera el nucleo de la aplicacion y la que permitira enlazarnos a cada
 * uno de los JPanel que estamos heredando para cada menu y para el escenario.
 * @version 1.0, 
 * @author Alvaro Blanco
 */

public class RType extends JFrame {
	public static final int ANCHO=800;
	public static final int ALTO=600;
	
	private Escenario escenario;
	private MenuPrincipal menu;
	private MenuFinJuego menuFin;
	
	public static void main(String[] args) {
		RType rtype=new RType(0);
	}
	
	public RType(int nivel){
		super("R-Type");
		if(nivel==0)
			menu = new MenuPrincipal(this);
		else if(nivel==-1)
			menuFin = new MenuFinJuego(this,true);
		else if(nivel==-2)
			menuFin = new MenuFinJuego(this,false);
		else
			escenario=new Escenario(nivel,this);
		
		setSize(ANCHO,ALTO);
		
		setResizable(false);
		if(nivel==0)
			add(menu);
		else if(nivel==-1 || nivel==-2)
			add(menuFin);
		else
			add(escenario);
		setVisible(true);
	}
	
	

}

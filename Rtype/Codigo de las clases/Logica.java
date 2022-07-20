import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Random;

/**
 * Clase que representa la logica del juego: control de colisiones, movimiento de las naves, creacion de las naves enemigas...
 * @version 1.0, 
 * @author Alvaro Blanco
 */

public class Logica {
	private static final int N_FACIL=10;
	private static final int N_NORMAL=15;
	private static final int N_COMPLICADO=20;
	private static final int N_IMPOSIBLE=30;
	
	private NaveAliada nave;
	private ArrayList<AlienA> alienA;
	private ArrayList<AlienB> alienB;
	private Random random;
	private boolean finJuego,victoria;
	
	public Logica(int x,int y,int nivel){
		nave= new NaveAliada(x,y);
		alienA= new ArrayList<AlienA>();
		alienB= new ArrayList<AlienB>();
		random=new Random();
		finJuego=false;
		victoria=false;
		int posYaux;
		
		switch(nivel){//añadimos mitad de naves alienA y mitad naves AlienB
		case 1:
			for(int i=0;i<N_FACIL;i++){
				do{
					posYaux=random.nextInt(RType.ALTO);
				}while(posYaux<45 || posYaux>RType.ALTO-80);
				if(i<N_FACIL/2)
					alienA.add(new AlienA(RType.ANCHO+random.nextInt(RType.ANCHO*2),posYaux,1));
				else
					alienB.add(new AlienB(RType.ANCHO+random.nextInt(RType.ANCHO*2),posYaux,1));
			}
			break;
		case 2:
			for(int i=0;i<N_NORMAL;i++){
				do{
					posYaux=random.nextInt(RType.ALTO);
				}while(posYaux<45 || posYaux>RType.ALTO-80);
				if(i<N_NORMAL/2)
					alienA.add(new AlienA(RType.ANCHO+random.nextInt(RType.ANCHO*2),posYaux,2));
				else
					alienB.add(new AlienB(RType.ANCHO+random.nextInt(RType.ANCHO*2),posYaux,2));
			}
			break;
		case 3:
			for(int i=0;i<N_COMPLICADO;i++){
				do{
					posYaux=random.nextInt(RType.ALTO-80);
				}while(posYaux<45 || posYaux>RType.ALTO-80);
				if(i<N_COMPLICADO/2)
					alienA.add(new AlienA(RType.ANCHO+random.nextInt(RType.ANCHO*3),posYaux,3));
				else
					alienB.add(new AlienB(RType.ANCHO+random.nextInt(RType.ANCHO*2),posYaux,3));
			}
			break;
		case 4:
			for(int i=0;i<N_IMPOSIBLE;i++){
				do{
					posYaux=random.nextInt(RType.ALTO-80);
				}while(posYaux<45 || posYaux>RType.ALTO-80);
				if(i<N_COMPLICADO/2)
					alienA.add(new AlienA(RType.ANCHO+random.nextInt(RType.ANCHO*3),posYaux,4));
				else
					alienB.add(new AlienB(RType.ANCHO+random.nextInt(RType.ANCHO*2),posYaux,4));
			}
			break;
		}
	}
	
	/**
	 * El núcleo del juego, se encargara de realizar toda la lógica y de controlar todo el juego cada vez que es llamado. 
	 */
	public void bucleJuego(){
		balasMover();
		
		//mover naves enemigas
		moverAlienA();
		moverAlienB();
		//comprobar colisiones 
		colisiones();
		
		//retirar aliens, una vez disparados y ejecutados el sprite de destruccion
		retirarAlien();
		
		//realizar movimientos nave
		if(nave.getmoverArriba())
			if(nave.moverArriba()<0)
				nave.moverAbajo();
		if(nave.getmoverAbajo())
			if(nave.moverAbajo()>(RType.ALTO-NaveAliada.ALTO_NAVE))
				nave.moverArriba();
		if(nave.getmoverDcha())
			if(nave.moverDcha()>(RType.ANCHO-NaveAliada.ANCHO_NAVE))
				nave.moverIzq();
		if(nave.getMoverIzq())
			if(nave.moverIzq()<0)
				nave.moverDcha();
		
		//comprobar victoria
		if((alienA.size()+alienB.size())==0)
		{
			victoria=true;
			finJuego=true;
		}
	}
	
	/**
	 * Comprueba todo tipo de colisiones
	 */
	public void colisiones(){
		balasFin();
		colisionAlienNave();
		colisionBalaAlien();
	}
	
	/**
	 * Comprueba si las balas han llegado al final de la pantalla
	 */
	private void balasFin(){

		int i=0;
		
		while(i<nave.numeroBalas()){
			if(nave.consultarBala(i).getPosX()>RType.ANCHO){
				nave.eliminarBala(i);
			}else{
				i++;
			}
		}
	}
	/**
	 * Comprueba si ha habido colision entre nave-alien
	 */
	private void colisionAlienNave(){
		for (int i=0;i<alienA.size();i++){
			if(comprobarColision(alienA.get(i).getRect(),nave.getRect1()) || comprobarColision(alienA.get(i).getRect(),nave.getRect2())){
				finJuego=true;
				nave.tocado();
				System.out.println("Fin del juego");
			}
		}
		
		for (int i=0;i<alienB.size();i++){
			if(comprobarColision(alienB.get(i).getRect(),nave.getRect1()) || comprobarColision(alienB.get(i).getRect(),nave.getRect2())){
				finJuego=true;
				nave.tocado();
				System.out.println("Fin del juego");
			}
		}
	}
	/**
	 * Comprueba si ha habido colision entre bala-alien
	 */
	private void colisionBalaAlien(){
		int i=0;
		int j;
		while(i<nave.numeroBalas()){
			j=0;
			while(j<alienA.size()){
				if(comprobarColision(nave.consultarBala(i).getRect(),alienA.get(j).getRect())){
						nave.eliminarBala(i);
						alienA.get(j).tocado();
						i--;
						break;
				}
				j++;
			}
			i++;
		}
		i=0;
		while(i<nave.numeroBalas()){
			j=0;
			while(j<alienB.size()){
				if(comprobarColision(nave.consultarBala(i).getRect(),alienB.get(j).getRect())){
						nave.eliminarBala(i);
						alienB.get(j).tocado();
						i--;
						break;
				}
				j++;
			}
			i++;
		}
	}
	
	/**
	 * Mueve las balas en cada momento
	 */
	private void balasMover(){
		for(int i=0;i<nave.numeroBalas();i++){
			nave.consultarBala(i).moverBala();
		}
	}
	
	/**
	 * Mueve cada enemigo A a la izquierda y comprueba si ha sobrepasado la pantalla, volviendolo en su caso al otro extremo de pantalla
	 */
	private void moverAlienA(){
		for(int i=0;i<alienA.size();i++){
			alienA.get(i).mover();
			/*comprobamos si sale el alien del escenario*/
			if((alienA.get(i).getPosX()+AlienA.ANCHO_NAVE)<0){
				alienA.get(i).setPosX(RType.ANCHO);
			}
		}
	}
	/**
	 * Mueve cada enemigo B a la izquierda y comprueba si ha sobrepasado la pantalla, volviendolo en su caso al otro extremo de pantalla, 
	 * tambien comprueba que no salga por arriba o por abajo de la pantalla
	   */
	private void moverAlienB(){
		for(int i=0;i<alienB.size();i++){
			alienB.get(i).mover();
			/*comprobamos si sale el alien del escenario por la izquierda*/
			if((alienB.get(i).getPosX()+AlienB.ANCHO_NAVE)<0){
				alienB.get(i).setPosX(RType.ANCHO);
			}
			/*comprobamos si sale el alien del escenario por arriba*/
			if(alienB.get(i).getPosY()<45){
				alienB.get(i).cambiarSentidoY();
				alienB.get(i).setPosY(45);
			}
			/*comprobamos si sale el alien del escenario por abajo*/
			if(alienB.get(i).getPosY()>(RType.ALTO-50)){
				alienB.get(i).cambiarSentidoY();
				alienB.get(i).setPosY(RType.ALTO-50);
			}
			
			
		}
	}
	
	NaveAliada getNave(){
		return nave;
	}
	AlienA getAlienA(int i){
		return alienA.get(i);
	}
	AlienB getAlienB(int i){
		return alienB.get(i);
	}
	int numeroAlienA(){
		return alienA.size();
	}
	int numeroAlienB(){
		return alienB.size();
	}
	/**
	 * Comprueba si dos rectangulos estan tocandose,es decir, han colisionado
	 * @param rectangulo1 representa un rectangulo
	 * @param recantuglo2 representa un rectangulo
	 * @return si hay colision o no
	 */
	private boolean comprobarColision(Rectangle rectangulo1,Rectangle rectangulo2){
		if(((rectangulo1.x+rectangulo1.width)>rectangulo2.x) && 
		   ((rectangulo1.y+rectangulo1.height)>rectangulo2.y) &&
		   ((rectangulo2.x+rectangulo2.width)>rectangulo1.x) && 
		   ((rectangulo2.y+rectangulo2.height)>rectangulo1.y))
		   return true;

		return false;
	}
	
	public boolean getFin(){
		return finJuego;
	}
	public boolean getVictoria(){
		return victoria;
	}
	
	private void retirarAlien(){
		int j=0;
		while(j<alienA.size()){
			if(alienA.get(j).getExplosion()==0){
				alienA.remove(j);
			}else{
				j++;
			}
		}
		
		j=0;
		while(j<alienB.size()){
			if(alienB.get(j).getExplosion()==0){
				alienB.remove(j);
			}else{
				j++;
			}
		}
	}
}

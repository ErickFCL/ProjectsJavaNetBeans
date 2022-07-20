import java.awt.Rectangle;
import java.util.Random;


/**
 * Clase que almacena informacion referente a las naves alienigenas de Tipo B
 * @version 1.0, 
 * @author Alvaro Blanco
 */
public class AlienB extends Nave {
	
	public static final int ANCHO_NAVE=53;
	public static final int ALTO_NAVE=21;
	private static int velocidadX;
	private int velocidadY;
	private Rectangle rectangle;
	private Random random;
	private int nivel;
	
	public AlienB(int x,int y, int nivel){
		posX=x;
		posY=y;
		vive=true;
		spriteExplosion=3;
		this.nivel=nivel;
		this.velocidadY=0;
		
		rectangle= new Rectangle(posX,posY,ANCHO_NAVE,ALTO_NAVE);
		random = new Random();
		
		switch(nivel){
			case 1:
				velocidadX=5;
				break;
			case 2:
				velocidadX=6;
				break;
			case 3:
				velocidadX=7;
				break;
			case 4:
				velocidadX=9;
				break;
		}
	}
	/**
	 * Movemos la nave en funcion de la velocidad
	 */
	public void mover(){
		posX-=velocidadX;
		//1 de cada 100 comprobaciones cambiamos la velocidadY de la nave
		if(random.nextInt(100)<1)
			cambiarVelocidadY();
		posY+=this.velocidadY;
	}
	private void cambiarVelocidadY(){
		if(random.nextFloat()<0.5f)
			this.velocidadY=nivel;
		else
			this.velocidadY=-nivel;
	}
	/**
	 * cambia el sentido de movimiento de la nave B
	 */
	public void cambiarSentidoY(){
		velocidadY=-this.velocidadY;
	}
	
	public void actualizarRect(){
		rectangle.setLocation(posX, posY);
	}
	/**
	 * Devuelve un rect con informacion de la posicion y tamaño de la nave
	 * @return Rect
	 */
	public Rectangle getRect(){
		actualizarRect();
		return rectangle;
	}
}

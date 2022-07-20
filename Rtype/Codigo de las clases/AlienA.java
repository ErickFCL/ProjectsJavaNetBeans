
/**
 * Clase que almacena informacion referente a las naves alienigenas de Tipo A
 * @version 1.0, 
 * @author Alvaro Blanco
 */

import java.awt.Rectangle;

public class AlienA extends Nave {
	public static final int ANCHO_NAVE=53;
	public static final int ALTO_NAVE=21;
	
	private static int velocidad;
	
	private Rectangle rectangle;
	
	public AlienA(int x,int y, int nivel){
		posX=x;
		posY=y;
		vive=true;
		spriteExplosion=3;
		
		rectangle= new Rectangle(posX,posY,ANCHO_NAVE,ALTO_NAVE);

		switch(nivel){
			case 1:
				velocidad=5;
				break;
			case 2:
				velocidad=6;
				break;
			case 3:
				velocidad=7;
				break;
			case 4:
				velocidad=9;
				break;
		}
	}
	/**
	 * Mueve la nave en funcion de la velocidad
	 */
	public void mover(){
		posX-=velocidad;
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

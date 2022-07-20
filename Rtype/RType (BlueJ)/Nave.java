/**
 * Clase que se usara para crear posteriormente cualquier tipo de nave
 * @version 1.0, 
 * @author Alvaro Blanco
 */

public class Nave {
	
	protected int posX,posY;
	protected boolean vive;
	protected int spriteExplosion;
	
	int getPosX(){
		return posX;
	}
	
	int getPosY(){
		return posY;
	}
	void setPosX(int x){
		this.posX=x;
	}
	void setPosY(int y){
		this.posY=y;
	}
	/**
	 * @return vive, si la nave esta viva o no
	 */
	boolean getVive(){
		return vive;
		
	}
	/**
	 *  Metodo auxiliar para realizar una animacion de una explosion cuando hay una colision de la nave y es destruida
	 */
	public int spriteexplosion(){
		if(!vive && spriteExplosion>0){
			spriteExplosion-=1;
			return spriteExplosion;
		}else{
			return -1;
		}
	}
	public int getExplosion(){
		return spriteExplosion;
	}
	public void tocado(){
		vive=false;	
	}
}

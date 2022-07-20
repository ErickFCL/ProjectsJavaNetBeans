import java.awt.Rectangle;


public class Bala {
	private static final int VELOCIDAD_BALA=10;
	public static final int ANCHO_BALA=20;
	public static final int ALTO_BALA=4;

	private int posX,posY;
	private Rectangle rectangle;

	
	public Bala(int x,int y){
		this.posX=x;
		this.posY=y;
		
		rectangle= new Rectangle(posX,posY,ANCHO_BALA,ALTO_BALA);
	}
	
	int getPosX(){
		return posX;
	}
	
	int getPosY(){
		return posY;
		
	}
	
	void moverBala(){
		posX+=VELOCIDAD_BALA;
		
	}
	
	public void actualizarRect(){
		rectangle.setLocation(posX, posY);
	}
	
	public Rectangle getRect(){
		actualizarRect();
		return rectangle;
	}
}

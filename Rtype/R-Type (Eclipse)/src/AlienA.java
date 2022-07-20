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
	
	public void mover(){
		posX-=velocidad;
		//System.out.println("Se ha movido"+" -->"+posX+":"+posY);
	}
	
	public void actualizarRect(){
		rectangle.setLocation(posX, posY);
	}
	
	public Rectangle getRect(){
		actualizarRect();
		return rectangle;
	}
	
}

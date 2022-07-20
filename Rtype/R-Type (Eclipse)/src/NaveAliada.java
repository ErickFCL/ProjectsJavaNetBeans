import java.awt.Rectangle;
import java.util.ArrayList;


public class NaveAliada extends Nave {
	private ArrayList<Bala> balas;
	private Rectangle rectangle1,rectangle2;
	
	
	private static final int MOV_VERTICAL=5;
	private static final int MOV_HORIZONTAL=5;
	public static final int ANCHO_NAVE=55;
	public static final int ALTO_NAVE=73;
	
	private boolean movIzq,movDcha,movArriba,movAbajo;



	public NaveAliada(int x,int y){
		posX=x;
		posY=y;
		spriteExplosion=8;
		vive=true;
		
		movIzq=false;
		movDcha=false;
		movArriba=false;
		movAbajo=false;
		
		rectangle1= new Rectangle(posX,posY,ANCHO_NAVE/2,ALTO_NAVE);
		rectangle2= new Rectangle(posX+ANCHO_NAVE/2,posY+25,ANCHO_NAVE/2,25);
		
		balas=new ArrayList<Bala>();
	}
	
	public int moverIzq(){
		posX-=MOV_HORIZONTAL;
		return posX;
	}
	public int moverDcha(){
		posX+=MOV_HORIZONTAL;
		return posX;
	}
	public int moverArriba(){
		posY-=MOV_VERTICAL;
		return posY;
	}
	public int moverAbajo(){
		posY+=MOV_VERTICAL;
		return posY;
	}
	
	public void actualizarRect1(){
		rectangle1.setLocation(posX, posY);
	}
	
	public void actualizarRect2(){
		rectangle2.setLocation(posX+ANCHO_NAVE/2, posY+25);
	}
	public Rectangle getRect1(){
		actualizarRect1();
		return rectangle1;
	}
	public Rectangle getRect2(){
		actualizarRect2();
		return rectangle2;
	}
	
	
	public void disparo(int x,int y){
		balas.add(new Bala(x+(ANCHO_NAVE/2),y+(ALTO_NAVE)/2));
	}
	
	
	public void eliminarBala(int i){
		balas.remove(i);
	}
	
	public int numeroBalas(){
		return balas.size();
		
	}
	public Bala consultarBala(int i){
		return balas.get(i);
	}
	
	/*los siguientes metodos ayudaran a mover la nave sin saltos*/
	public boolean getMoverIzq(){
		return movIzq;
	}
	public boolean getmoverDcha(){
		return movDcha;
	}
	public boolean getmoverArriba(){
		return movArriba;
	}
	public boolean getmoverAbajo(){
		return movAbajo;
	}
	
	public void setMoverIzq(boolean a){
		movIzq=a;
	}
	public void setMoverDcha(boolean a){
		movDcha=a;
	}
	public void setMoverArriba(boolean a){
		movArriba=a;
	}
	public void setMoverAbajo(boolean a){
		movAbajo=a;
	}
}

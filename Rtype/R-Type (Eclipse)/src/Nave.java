
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
	
	boolean getVive(){
		return vive;
		
	}
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

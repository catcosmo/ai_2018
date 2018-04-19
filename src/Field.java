
public class Field {
	
	boolean blockedField; //if: own player on field, field gone, two stones on field
	byte bottomStone = 0; //[0-3] 0=empty, 1=player unten, dann uhrzeigersinn
	byte topStone = 0;		//[0-3] 0=empty, 1=player oben, dann uhrzeigersinn
	int x; 			 //x-Koordinate
	int y;			 //y-Koordinate
	
	public boolean isFreeField() {
		return blockedField;
	}
	public void setFreeField(boolean freeField) {
		this.blockedField = freeField;
	}
	public byte getPlayer() {
		return bottomStone;
	}
	public void setPlayer(byte player) {
		this.bottomStone = player;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	

}

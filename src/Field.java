
public class Field {
	
	boolean blockedField; //if: own player on field, field gone, two stones on field
	byte bottomStone = 0; //[0-3] 0=empty, 1=player unten, dann uhrzeigersinn
	byte topStone = 0;		//[0-3] 0=empty, 1=player oben, dann uhrzeigersinn
	int x; 			 //x-Koordinate
	int y;			 //y-Koordinate

	public void setBlockedField(boolean blockedField) {
		this.blockedField = blockedField;
	}

	public void setBottomStone(byte bottomStone) {
		this.bottomStone = bottomStone;
	}

	public void setTopStone(byte topStone) {
		this.topStone = topStone;
	}

	public boolean isBlockedField() {
		return blockedField;
	}

	public byte getBottomStone() {
		return bottomStone;
	}

	public byte getTopStone() {
		return topStone;
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() { return y; }
	public void setY(int y) {
		this.y = y;
	}

}

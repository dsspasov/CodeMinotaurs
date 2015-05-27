/**
 * @author Lazarov94
 *
 */
class Cordinates {
	int x;
	int y;

	Cordinates(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void set(int x, int y){
		this.x = x;
		this.y = y;
	}
	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}
	
	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}
	
	boolean equals(Cordinates a){
		if(this.x == a.x && this.y== a.y){
			return true;
		} else {
			return false;
		}
	}
}

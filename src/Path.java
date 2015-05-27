import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Lazarov94
 *
 */
class Path {
	public List<Cordinates> listOfCordinates;
	public int length;
	Cordinates start,end;
	
	Path(int length, Cordinates start, Cordinates end){
		listOfCordinates = new ArrayList<Cordinates>();
		this.length = length;
		pathGenerator(start, end);
	}
	void add(Cordinates a){
		listOfCordinates.add(a);
	}
	
	public void pathGenerator(Cordinates from, Cordinates to){
		Random a = new Random();
		int fromX = from.x;
		int fromY = from.y;
		int minNumberOfSteps = Math.abs((to.x - from.x) + (to.y - from.y));
		listOfCordinates.add(new Cordinates(fromX, fromY)); // we have got the 1st point here so the loop will iterate -1
		
		if(length == minNumberOfSteps){
		int i = 0;
				while(i!= minNumberOfSteps-1){
				if(fromX < to.x){
					fromX++;
					listOfCordinates.add(new Cordinates(fromX, fromY));
					i++;
				} else {
					fromX--;
					listOfCordinates.add(new Cordinates(fromX, fromY));
					i++;
				}
				
				if(fromY < to.y){
					fromY++;
					listOfCordinates.add(new Cordinates(fromX, fromY));
					i++;
				} else {
					fromY--;
					listOfCordinates.add(new Cordinates(fromX, fromY));
					i++;
				}
				
			}
		} else if( length > minNumberOfSteps){
			
			
			
		}
	}
}
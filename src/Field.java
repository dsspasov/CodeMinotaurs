import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Lazarov94
 *
 */
public class Field {
	Question[][] matrix;
	private int numberOfPlayers; // 
	private int sizeOfTheField;
	List<Question> questionsFromDB; // The questions from the data base
	private int startX;
	private int startY;
	List<Player> listOfPlayers;
	private int numberOfPathsForAPlayer; // Depends on the size of the map 
	Path[] allPaths;
	public List<Cordinates> startingPossitions;

	Field() {
		this.numberOfPlayers = 1;
		sizeOfTheField = 5;
		generatePossitions(1);
	}

	Field(int sizeOfTheField, List<Player> listOfPlayers) {
		this.numberOfPlayers = listOfPlayers.size();
		this.sizeOfTheField = sizeOfTheField;
		this.numberOfPathsForAPlayer = 4; // it depends on the size they want but it is 4 for now.
		generatePossitions(this.numberOfPlayers);
	}

	private void generatePlayersPossitions() {
		
		for (int i = 0; i < numberOfPlayers; i++) { // the list of players and the list of startingPossitions is with same number of elements
			listOfPlayers.get(i).setxCoordinate(startingPossitions.get(i).x);  
			listOfPlayers.get(i).setyCoordinate(startingPossitions.get(i).y);
		}
	}
	
	private void generatePossitions(int numberOfPossitions){
		numberOfPossitions = this.numberOfPlayers;
		
		switch (numberOfPossitions) {
			
		case 1:
			startingPossitions.add(new Cordinates(sizeOfTheField/2, 0));
			break;
		case 2:
			startingPossitions.add(new Cordinates(sizeOfTheField/2, 0));
			startingPossitions.add(new Cordinates(sizeOfTheField/2,sizeOfTheField - 1));
			break;
		case 3:
			startingPossitions.add(new Cordinates(sizeOfTheField/2, 0));
			startingPossitions.add(new Cordinates(sizeOfTheField/2,sizeOfTheField - 1));
			startingPossitions.add(new Cordinates(0, sizeOfTheField/2));
			break;
		case 4:
			startingPossitions.add(new Cordinates(sizeOfTheField/2, 0));
			startingPossitions.add(new Cordinates(sizeOfTheField/2,sizeOfTheField - 1));
			startingPossitions.add(new Cordinates(0, sizeOfTheField/2));
			startingPossitions.add(new Cordinates(sizeOfTheField - 1, sizeOfTheField/2));
			break;
		}
	}
		
	

	/*private void generateStartingPossition() { // It can drop a player on 2*k or 2*k+1 place so it is not fair but we can change it.
		Random a = new Random();
		Random b = new Random();
		int numberOfPlayers = this.numberOfPlayers;
		int sideOfTheField = b.nextInt(4);
		int minToMax = a.nextInt(sizeOfTheField);
		
		switch (sideOfTheField) {
		case 0:
			startX = 0;
			startY = minToMax;
			break;
		case 1:
			startX = minToMax;
			startY = 0;
			break;
		case 2:
			startX = sizeOfTheField - 1;
			startY = minToMax;
			break;
		case 3:
			startX = minToMax;
			startY = sizeOfTheField - 1;
			break;
		}
	}*/

	private void generatePathsForPlayersInTheMatrix() {
		
	}
	Path randomPathGenerator(Cordinates from, Cordinates to, int lenghtOfThePath){
		
		
		
		return null;
		
		
	}

}

class Cordinates {
	int x;
	int y;

	Cordinates(int x, int y) {
		this.x = x;
		this.y = y;
	}
	boolean equals(Cordinates a){
		if(this.x == a.x && this.y== a.y){
			return true;
		} else {
			return false;
		}
	}
}
class Path {
	public List<Cordinates> listOfCordinates;
	public int length;
	
	Path(int length){
		listOfCordinates = new ArrayList<Cordinates>();
		this.length = length;
	}
	
	void add(Cordinates a){
		listOfCordinates.add(a);
	}
}

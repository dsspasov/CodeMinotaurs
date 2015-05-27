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
	Player[] listOfPlayers;
	private int numberOfPathsForAPlayer; // Depends on the size of the map 
	Path[] allPaths;

	Field() {
		this.numberOfPlayers = 1;
		sizeOfTheField = 5;
	}

	Field(int numberOfPayers, int sizeOfTheField) {
		this.numberOfPlayers = numberOfPayers;
		this.sizeOfTheField = sizeOfTheField;
		this.numberOfPathsForAPlayer = 4; // it depends on the size they want but it is 4 for now.
	}

	private void generatePlayers() {

		listOfPlayers = new Player[numberOfPlayers];
		Scanner input = new Scanner(System.in);
		String name;
		
		for (int i = 1; i < numberOfPlayers + 1; i++) {
			System.out.print("Player[" + i + "] enter your name: ");
			name = input.nextLine();
			generateStartingPossition();
			listOfPlayers[i] = new Player(name, 0, startX, startY);
		}
	}

	private void generateStartingPossition() { // It can drop a player on 2*k or 2*k+1 place so it is not fair but we can change it.
		Random a = new Random();
		Random b = new Random();
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
	}

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

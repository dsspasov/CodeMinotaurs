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
	List<Player> listOfPlayers;
	private int numberOfPathsForAPlayer; // Depends on the size of the map 
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


	private void generatePathsForPlayersInTheMatrix() {
		
	}
	
	private Path randomPathGenerator(Cordinates from, Cordinates to, int lenghtOfThePath){
		
		return null;
	}

}




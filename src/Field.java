import java.util.List;
import java.util.Random;

/**
 * @author Lazarov94
 *
 */
public class Field {	
	Question[][] matrix;
	int numberOfPlayers;
	int sizeOfTheField;
	List<Question> questionsFromDB; // The questions from the data base 
	int startX;
	int startY;
	Player[] listOfPlayers;
	
	Field(){
		this.numberOfPlayers = 1;
		sizeOfTheField = 5;
	}
	
	Field(int numberOfPayers, int sizeOfTheField){
		this.numberOfPlayers = numberOfPayers;
		this.sizeOfTheField = sizeOfTheField;
	}
	private void generatePlayers(){
		generateStartingPossition();
		listOfPlayers = new Player[numberOfPlayers];
		for(int i = 0 ; i < numberOfPlayers ; i++){
			listOfPlayers[i] = new Player("", 0, startX, startY);
		}
	}
	
	private void generateStartingPossition(){
		Random a = new Random();
		Random posX = new Random();
		int sideOfTheField = posX.nextInt(4);
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
			  startX = sizeOfTheField-1;
			  startY = minToMax;
		        break;
		  case 3:
			  startX = minToMax;
			  startY = sizeOfTheField-1;
		        break;
		}
	}
	
	private void generateField(){
		matrix = new Question[sizeOfTheField][sizeOfTheField];
			for(int i = 0; i < matrix.length ; i++){
				
			}
		
	}
	
}

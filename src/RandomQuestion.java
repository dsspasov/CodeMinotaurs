import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomQuestion {
	private List<Question> easy = new ArrayList<Question>();
	private List<Question> medium = new ArrayList<Question>();
	private List<Question> hard = new ArrayList<Question>();
	
	List<Question> listOfQuestions = new ArrayList<Question>();
	
	public void filler () {
		
		for (Question question : listOfQuestions) {
			if(question.getId() == 1) {
				easy.add(question);
			} else if (question.getId() == 2) {
				medium.add(question);
			} else {
				hard.add(question);
			}
		}
	}
	
	public RandomQuestion () {
		this.easy = filler(listOfQuestions);
	}
	
	public Question getEasyQuestion (List<Question> easy) {
		easy.addAll(this.easy);
		Random rand = new Random();
		int questionIndex = rand.nextInt(easy.size());
		return easy.remove(questionIndex);
	}
	
	public Question getMediumQuestion (List<Question> medium) {
		medium.addAll(this.medium);
		Random rand = new Random();
		int questionIndex = rand.nextInt(medium.size());
		return medium.remove(questionIndex);
	}
	
	public Question getHardQuestion (List<Question> hard) {
		hard.addAll(this.hard);
		Random rand = new Random();
		int questionIndex = rand.nextInt(hard.size());
		return hard.remove(questionIndex);
	}
}

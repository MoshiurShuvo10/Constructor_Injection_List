package beans;

import java.util.Iterator;
import java.util.List;

public class Question {
	private int questionId;
	private String question;
	private List<Answer> answers ;
	
	public Question(int questionId, String question, List<Answer> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}

	public void displayQuestion() {
		System.out.println("Question id: "+questionId);
		System.out.println("Question: "+question);
		Iterator it = answers.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

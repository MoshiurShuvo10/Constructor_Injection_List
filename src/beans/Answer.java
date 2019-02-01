package beans;

public class Answer {
	
	private int answerId;
	private String answer;
	private String answeredBy;
	
	public Answer(int answerId, String answer, String answeredBy) {
		super();
		this.answerId = answerId;
		this.answer = answer;
		this.answeredBy = answeredBy;
	}

	@Override
	public String toString() {
		return " Answer = " + answer + "\n Answered By = " + answeredBy ;
	}
	
	

}

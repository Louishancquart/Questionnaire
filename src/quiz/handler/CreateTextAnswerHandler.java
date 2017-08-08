package quiz.handler;

import quiz.Answer;
import quiz.TextAnswer;


public class CreateTextAnswerHandler extends CreateAnswerHandler {

	public static CreateTextAnswerHandler INSTANCE;
	
	private CreateTextAnswerHandler() {
		
	}
	
	public CreateTextAnswerHandler(CreateAnswerHandler next) {
		this.INSTANCE.setNextHandler(next);
	}
	
	public Answer<?> createCommand(String text) {
		return new TextAnswer(text);
	}
	
}

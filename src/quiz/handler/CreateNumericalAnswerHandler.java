package quiz.handler;

import quiz.Answer;
import quiz.NumericalAnswer;


public class CreateNumericalAnswerHandler extends CreateAnswerHandler {
	
	public static CreateNumericalAnswerHandler INSTANCE;
	
	private CreateNumericalAnswerHandler() {
		
	}
	
	public CreateNumericalAnswerHandler(CreateAnswerHandler next) {
		
	}
	
	public Answer<?> createAnswerHandler(String text) {
		try {
			int i =Integer.parseInt(text);
			return new NumericalAnswer(i);
		} catch (NumberFormatException e) {
			return null;
		}
	}
	
}

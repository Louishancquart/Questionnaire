package quiz.handler;

import quiz.Answer;
import quiz.YesNo;
import quiz.YesNoAnswer;


public class CreateYesNoAnswerHandler extends CreateAnswerHandler {
	
	public static CreateYesNoAnswerHandler INSTANCE;
	
	private CreateYesNoAnswerHandler() {
		
	}
	
	public CreateYesNoAnswerHandler(CreateAnswerHandler next) {
		
	}
	
	public Answer<?> createCommand(String text) {
		try {
			return new YesNoAnswer(YesNo.valueOf(text));
		} catch (IllegalArgumentException e) {
			return null;
		}
	}
	
}

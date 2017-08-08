package quiz.handler;

import quiz.Answer;

public class CreateAnswerHandler {

	private CreateAnswerHandler next;
	
	public CreateAnswerHandler(CreateAnswerHandler next) {
		
	}
	
	public CreateAnswerHandler() {
		
	}
	
	public Answer<?> createCommand(String text) {
		return null;
	}
	
	public Answer<?> postCreateCommand(String text) {
		Answer<?> answer = this.createCommand(text);
		if(answer != null) {
			return answer;
		} else {
			return this.next.postCreateCommand(text);
		}
	}
	
	public void setNextHandler(CreateAnswerHandler handler) {
		this.next = handler;
	}
	
}

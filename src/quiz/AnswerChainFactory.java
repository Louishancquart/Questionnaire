package quiz;
import quiz.handler.*;

public class AnswerChainFactory {
	
	private CreateAnswerHandler answerHandler;
	public static AnswerChainFactory FACTORY;
	
	private void AnswerChainFactory(){
		
	}
	
	public void addCreateAnswerHandler(CreateAnswerHandler cah){
		this.answerHandler = new CreateAnswerHandler();
	}
	
	public Answer<?> build(String answer) {		
		return this.answerHandler.postCreateCommand(answer);
	}
	
}

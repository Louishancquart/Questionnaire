package quiz;


public class AnswerFactory {

	public static AnswerFactory FACTORY;
	
	public Answer<?> build(String answer) {
		
		if (YesNoAnswer.build(answer) != null)
			return YesNoAnswer.build(answer);
		else if (NumericalAnswer.build(answer) != null)
			return NumericalAnswer.build(answer);
		else
			return TextAnswer.build(answer);
	}
	
	public Answer<?> build(String answer, String answer2) {
		return null;
	}
}

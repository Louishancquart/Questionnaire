package quiz;


public class NumericalAnswer extends Answer<Integer> {

	public NumericalAnswer(Integer bonneReponse) {
		super(bonneReponse);
		// TODO Auto-generated constructor stub
	}
	
	public static Answer<?> build(String answerText) {
		if (NumericalAnswer.build(answerText).estRecevable(answerText)) {
			return new NumericalAnswer(Integer.parseInt(answerText));
		}
		return null;
	}
	
	public boolean estRecevable(String reponse) {
		try {
			Integer.parseInt(reponse);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	public String getTypeAttendu() {
		return "numerique";
	}

}

package quiz;


public class YesNoAnswer extends Answer<YesNo> {

	public YesNoAnswer(YesNo bonneReponse) {
		super(bonneReponse);
	}
	
	public static Answer<?> build(String answerText) {
		return new YesNoAnswer(YesNo.valueOf(answerText));
	}
	
	public boolean estRecevable(String reponse){
		try {
			YesNo.valueOf(reponse);
			return true;
		} catch (IllegalArgumentException e) {
			return false;
		}
	}
	
	public String getTypeAttendu() {
		return "oui/non";
	}

}

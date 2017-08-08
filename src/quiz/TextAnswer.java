package quiz;


public class TextAnswer extends Answer<String> {

	public TextAnswer(String bonneReponse) {
		super(bonneReponse);
		// TODO Auto-generated constructor stub
	}
	
	public static Answer<?> build(String answerText) {
		return new TextAnswer(answerText);
	}
	
	public boolean estRecevable(String reponse) {
		return true;
	}
	
	public String getTypeAttendu() {
		return "texte";
	}
	
}

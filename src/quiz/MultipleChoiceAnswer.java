package quiz;

import java.util.List;


public class MultipleChoiceAnswer extends TextAnswer {

	private List<String> lesPropositions;
	
	public MultipleChoiceAnswer(List<String> reponses) {
		super(null);
		
		this.lesPropositions = reponses;
		
	}
	
	public static Answer<?> build(String answer) {
		return null;
	}
	
	public boolean estRecevable(String reponse) {
		for (int i=0; i< lesPropositions.size(); i++){
			if (reponse == lesPropositions.get(i))
				return true;
		}
		return false;
	}
	
	public String getTypeAttendu() {
		return "multiple";
	}

}

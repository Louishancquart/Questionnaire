package quiz;


public class Answer<T> {
	
	protected T bonneReponse;
	
	public Answer( T bonneReponse) {
		this.bonneReponse = bonneReponse;
	}
	
	public String getTypeAttendu() {
		return null;
	}
	
	public boolean estCorrecte(String reponse){
		return false;
	}
	
	public boolean estRecevable(String reponse){
		return false;
	}
	
	public T getBonneReponse() {
		return bonneReponse;
	}
	public String getTextBonneReponse() {
		return this.bonneReponse.toString();
	}
	
}

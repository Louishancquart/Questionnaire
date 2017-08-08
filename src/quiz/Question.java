package quiz;


public class Question {
	
	protected String ennonce;
	protected Answer<?> bonneReponse;
	protected int nbPoints;
	
	public Question(String ennonce, Answer<?> bonneReponse, int nbPoints) {
		
		this.ennonce = ennonce;
		this.bonneReponse = bonneReponse;
		this.nbPoints = nbPoints;
		
	}
	
	public boolean estCorrecte(String reponse) {
		return reponse.equals(this.getBonneReponse());
	}
	
	public boolean estRecevable(String reponse) {
		return this.bonneReponse.estRecevable(reponse);
	}
	
	public String getBonneReponse() {
		return this.bonneReponse.toString();
	}
	
	public String getEnnonce() {
		return this.ennonce;
	}
	
	public int getPoints() {
		return this.nbPoints;
	}
	
	public String getTypeAttendu() {
		return bonneReponse.getTypeAttendu();
	}
	
}

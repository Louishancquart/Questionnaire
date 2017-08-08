
package quiz;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Questionnaire {

	private List<Question> lesQuestions ;

	public Questionnaire() {
		this.lesQuestions = new LinkedList<Question>();
		this.initQuestionnaire("lol");
	}

	/**
	 * pose une questionnaire : 
     * chaque question est posée à son tour, les points sont cumulés
	 */
	public void poser() {
		int nbPoints = 0;
		for (Question question : this.lesQuestions) {
			System.out.println(question.getEnnonce());
			String reponse = null;
			do {
				try {
					System.out.println("("+question.getTypeAttendu()+") ");
					reponse = util.Input.readLine();
				} catch (java.io.IOException e) {
					reponse = "";
				}
			} while (! question.estRecevable(reponse)) ;
			if (question.estCorrecte(reponse)) {
				System.out.println("correct, (" + question.getPoints() + " point(s))");
				nbPoints = nbPoints + question.getPoints();
			} else {
				System.out.println("incorrect, la bonne reponse etait : " + question.getBonneReponse());
			}
		}
		System.out.println("Vous avez obtenu " + nbPoints + " point(s)");
	}
    
    public void initQuestionnaire(String quest) {
    	Questionnaire questionnaire = new Questionnaire();
    	questionnaire.createQuestion("quelle est la réponse?", "reponse", "1");
    }
    
    public Question createQuestion(String ennonce, String answer, String points) {
    	Answer<?> gen_answer = AnswerFactory.FACTORY.build(answer);
    	return new Question(ennonce, gen_answer, Integer.parseInt(points));
    }


}
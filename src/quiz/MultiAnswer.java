package quiz;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class MultiAnswer extends Answer<List<String>> {

	private List<TextAnswer> rep;
	
	public MultiAnswer(List<String> reponses) {
		super(reponses);
		this.rep = new LinkedList <TextAnswer>();
		
		for (String s : reponses) {
			this.rep.add(new TextAnswer(s));
		}
	}
	
	public static Answer<?> build(String s){
		if (s == null || !(s.contains(";"))) {
			throw new IllegalArgumentException();
		} else {
			String []t = s.split(";");
			return new MultiAnswer(Arrays.asList(t));
		}
	}
	
	public boolean estCorrecte(String s){
		for(TextAnswer sa : rep) {
			if (sa.estCorrecte(s)){
				return true;
			}
		}
		return false;
	}
	
	public boolean estRecevable(String s){
		return false;
	}
	
	public String getTypeAttendu(){
		return null;
	}

}

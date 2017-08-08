import java.io.*;

public class TestIO {

	public void copieFichierTexte(String nomFichierSource, String nomFichierCible) {
		File source = new File(nomFichierSource);
		File cible = new File(nomFichierCible);
		try {
			BufferedReader in = new BufferedReader(new FileReader(source));
			PrintWriter out = new PrintWriter(new FileWriter(cible));
			String ligne = "";
			while (ligne != null) {
				ligne = in.readLine();
				out.println(ligne);
			}
			out.close();
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void afficheFichierTexte(String nomFichierSource) {
		File source = new File(nomFichierSource);
		try {
			BufferedReader in = new BufferedReader(new FileReader(source));
			String ligne = "";
			while (ligne != null) {
				ligne = in.readLine();
				System.out.println(ligne);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		// new TestIO().copieFichierTexte("essai.txt","output.txt");
		new TestIO().afficheFichierTexte("question_tolkien.txt");
	}
}

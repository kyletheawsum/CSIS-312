package stevens.week.four;

import java.util.Random;

public class Stringbuilder {
	
	private static final String[] ARTICLES = new String[] {"the","a","one","some","any"};
	private static final String[] NOUNS = new String[] {"boy","girl","dog","town","car"};
	private static final String[] VERBS = new String[] {"drove","jumped","ran","walked","skipped"};
	private static final String[] PREPOSITIONS = new String[] {"to","from","over","under","on"};
	
	private static StringBuilder createSentence() {
		// create StringBuilder
		StringBuilder sentence = new StringBuilder();
		// create random to select random value
		Random r = new Random();
		
		// append random article
		String capitalizedArticle = ARTICLES[r.nextInt(4)].toString();
		capitalizedArticle = capitalizedArticle.substring(0, 1).toUpperCase() + capitalizedArticle.substring(1);
		sentence.append(capitalizedArticle).append(" ").toString();
		
		// append random noun
		sentence.append(NOUNS[r.nextInt(4)]).append(" ");
		
		// append random verb
		sentence.append(VERBS[r.nextInt(4)]).append(" ");
		
		// append random preposition
		sentence.append(PREPOSITIONS[r.nextInt(4)]).append(" ");
		
		// append random article
		sentence.append(ARTICLES[r.nextInt(4)]).append(" ");
		
		// append random noun
		sentence.append(NOUNS[r.nextInt(4)]).append(".");

		return sentence;
	}
	
	public static void main(String[] args) {
		System.out.println("Kyle Stevens - Assignment 4: Program 1\n");
		  
		for(int i = 0; i < 20; i++) {
			System.out.println(String.format("Sentence %d: %s", i, createSentence()));
		}
	}
}

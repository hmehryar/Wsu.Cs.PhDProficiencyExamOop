/**
 * 
 */
package winter2011;

import java.util.ArrayList;

/**
 * @author Haydar Mehryar
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("WSU CS PhD Prof Exam Winter 2011");
		 List article=new List();
		 List noun=new List();
		 List verb=new List();
		 List preposition=new List();
		 List sentence=new List(article,noun,verb,preposition);
	
		 
		 String[] articles=new String[] {"the","a","one","some","any"};
		 article.initializeList(articles);
		 
		 String[] nouns=new String[] {"boy","girl","dog","town","car"};
		 noun.initializeList(nouns); 
		 
		 String[] verbs=new String[] {"drove","jumped","ran","walked","skipped"};
		 verb.initializeList(verbs);
		 
		 String[] prepositions=new String[] {"to","from","over","under","on"};
		 preposition.initializeList(prepositions);
		 
		 for (int i = 0; i < 20; i++) {
			 sentence.sentenceComposer();
		}
		 sentence.sentenceComposer();
		 
	}

}

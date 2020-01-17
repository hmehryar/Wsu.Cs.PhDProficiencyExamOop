/**
 * 
 */
package winter2011;

import java.util.LinkedList;
import java.util.Random;

/**
 * @author Neda
 *
 */
public class List extends LinkedList<String> {
	private List article;
	private List noun;
	private List verb;
	private List preposition;
	private Random random;
	public List() {
		 super();
	}
	public List(List article,List noun,List verb,List preposition) {
		this.article=article;
		this.noun=noun;
		this.verb=verb;
		this.preposition=preposition;
		this.random=new Random(100000);
	}
	public void initializeList(String[] inputArray){
		for(String item : inputArray ) {
			 this.add(item);
		 }
	}
	public void sentenceComposer() {
		String sentence=
			String.join(" ",
					capitalize(selectRandom(article)),selectRandom(noun),
					selectRandom(verb),selectRandom(preposition)
					);
		sentence=sentence+".";
		System.out.println(sentence);
	}
	
	private String selectRandom(List inputList) {
		
		int index= random.nextInt(inputList.size()-1);
		return inputList.get(index);
	}
	private String capitalize(String input) {
		if(input==null || input.isEmpty()) {
			return input;
		}
		return input.substring(0,1).toUpperCase()+input.substring(1);
	}
	
}

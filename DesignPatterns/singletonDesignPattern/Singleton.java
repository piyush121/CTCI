package singletonDesignPattern;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Singleton {

	private static Singleton onlyInstance = null;

	private String[] scrabbleLetters = { "a", "a", "a", "a", "a", "a", "a", "a", "a", "b", "b", "c", "c", "d", "d", "d", "d",
			"e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h", "h", "i", "i",
			"i", "i", "i", "i", "i", "i", "i", "j", "k", "l", "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n",
			"o", "o", "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r", "r", "r", "s", "s", "s", "s",
			"t", "t", "t", "t", "t", "t", "u", "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z" };
	private List<String> letterList = new LinkedList<>(Arrays.asList(scrabbleLetters));
	static boolean firstThread = true;

	private Singleton() {
	}

	public static Singleton getInstance() {

		
			if (firstThread) {  // testing if different thread tries to create new instance.
				firstThread = false;
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (onlyInstance == null) {
			synchronized (Singleton.class) {
				onlyInstance = new Singleton();
			}

		}
		return onlyInstance;
	}

	public List<String> getLetters() {
		Collections.shuffle(letterList);
		return letterList;
	}
	
	public List<String> getTiles(int howManyTiles){ 
		
		List<String> tilesToSend = new LinkedList<>();
		
		for(int i = 0; i <= howManyTiles; i++) {
			
			tilesToSend.add(onlyInstance.getLetters().remove(0));
		}
		
		
		return tilesToSend;
	}

}

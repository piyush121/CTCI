package singletonDesignPattern;

import java.util.LinkedList;
import java.util.List;

public class ScrabbleTest {
	
	public static void main(String[] args) {
		
		Singleton instance1 = Singleton.getInstance();
		System.out.println("1st Instance ID: " + System.identityHashCode(instance1));
		
		
		List<String> playerOneTiles = instance1.getTiles(7);
		System.out.println("Player 1: " + playerOneTiles); 
		System.out.println(instance1.getLetters());
		
		Singleton instance2 = Singleton.getInstance();
		System.out.println("2nd Instance ID: " + System.identityHashCode(instance1));

		List<String> playerTwoTiles = instance2.getTiles(7);
		System.out.println("Player 1: " + playerTwoTiles); 
		System.out.println(instance2.getLetters());
	}

}

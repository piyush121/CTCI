package singletonDesignPattern;

import java.util.Collections;
import java.util.List;

public class GetTheTiles implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Singleton instance = Singleton.getInstance();
		System.out.println("Instance ID: " + System.identityHashCode(instance));

		List<String> tiles = instance.getTiles(7);
		System.out.println("Player: " + tiles); 
		System.out.println(instance.getLetters());
		
	}

}

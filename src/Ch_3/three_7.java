package Ch_3;

import java.util.LinkedList;
import java.util.Queue;			//Quite straight forward. Not implementing corner cases.
class Animal
{
	String name;
	int time=0;
}

class Dog extends Animal{
	Dog(String name)
	{
		super.name=name;
		super.time++;			// I am assuming that time will be the time of creation of that object..
								// and we will insert them in order of their creation. This will make
								// it easier.. although interviewer can ask you to change it if desired.
								// Still it won't be very hard to do it anyways.
	}
	
	
}
class Cat  extends Animal{

}

public class three_7 {

	Queue<Animal> dogque=new LinkedList<>();
	Queue<Animal> catque=new LinkedList<>();
	
	public Animal dequeany()
	{
		Animal dog=dogque.peek();
		Animal cat=catque.peek();
		
		if(dog.time<=cat.time)
			return dogque.poll();
		else
			return catque.poll();
	}
	public void enque(Animal animal)
	{	
		if(animal instanceof Dog)
			dogque.add(animal);
		else
			catque.add(animal);
	}
}

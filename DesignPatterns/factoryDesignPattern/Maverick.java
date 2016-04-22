package factoryDesignPattern;

public class Maverick extends Gun {

	public Maverick() {
		setName("Maverick");
		setWeight(4);
		setBulletsPerRound(30);

		System.out.println("Maverick Delivered");

	}

}

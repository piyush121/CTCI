package factoryDesignPattern;

public class Ak47 extends Gun {

	public Ak47() {
		setName("Ak47");
		setWeight(5);
		setBulletsPerRound(30);

		System.out.println("Ak-47 Delivered");
	}

}

package factoryDesignPattern;

public class Client {

	public static void main(String[] args) {
		GunsFactory newGun = new GunsFactory();
		Gun maverick = newGun.makeGuns("M");
		maverick.reload();

	}

}

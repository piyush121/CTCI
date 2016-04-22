package factoryDesignPattern;

public class GunsFactory {

	public Gun makeGuns(String GunType) {
		if (GunType == "A")
			return new Ak47();
		else if (GunType == "M")
			return new Maverick();
		else
			throw new IllegalArgumentException();

	}

}

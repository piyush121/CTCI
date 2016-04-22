package factoryDesignPattern;

public abstract class Gun {

	private String name;
	private int weight;
	private int bulletsPerRound;

	public String getName() {
		return name;
	}

	public Gun() {
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getBulletsPerRound() {
		return bulletsPerRound;
	}

	public void setBulletsPerRound(int bulletsPerRound) {
		this.bulletsPerRound = bulletsPerRound;
	}

	public void reload() {
		System.out.println("Gun Reloaded");
	}

}

package observerDesignPattern;

import java.util.ArrayList;

public class StockGrabber implements GrabberofStocks {

	private double IBMPrice;
	private double googPrice;
	private ArrayList<Observer> list;

	public StockGrabber(double iBMPrice, double googPrice) {
		super();
		IBMPrice = iBMPrice;
		this.googPrice = googPrice;
		this.list = new ArrayList<>();
	}

	public ArrayList<Observer> getObserverList() {
		return list;
	}

	public void setPrice(Double ibmPrice, Double googPrice) {
		this.IBMPrice = ibmPrice;
		this.googPrice = googPrice;
		update();

	}

	public void registerObserver(Observer obs) {
		list.add(obs);
	}

	public void setIBMPrice(double iBMPrice) {
		IBMPrice = iBMPrice;
		update();
	}

	public void setGoogPrice(double googPrice) {
		this.googPrice = googPrice;
		update();
	}

	public void deregObserver(Observer deobs) {
		list.remove(deobs);
	}

	public void update() {
		for (Observer obs : list) {
			obs.setPrice(IBMPrice, googPrice);
		}

	}

}

package observerDesignPattern;

import java.util.ArrayList;

public interface GrabberofStocks {
	
	public void registerObserver(Observer obs);
	public void deregObserver(Observer deobs);
	public void update();
	public ArrayList<Observer> getObserverList();

}

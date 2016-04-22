package observerDesignPattern;

public class GrabStocks {

	public static void main(String[] args) {

		StockGrabber grabStock = new StockGrabber(100.00, 200.00);

		Observer obs1 = new StockObserver(grabStock);
		Observer obs2 = new StockObserver(grabStock);

		Runnable stock1 = new GetTheStock("IBM", grabStock, 101.00);
		Runnable stock2 = new GetTheStock("Google", grabStock, 202.02);
		new Thread(stock1).start();
		new Thread(stock2).start();
	}

}

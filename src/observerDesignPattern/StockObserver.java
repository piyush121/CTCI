package observerDesignPattern;

public class StockObserver implements Observer {

	private Double IBMPrice;
	private Double googPrice;
	private GrabberofStocks grabber;
	
	public StockObserver( GrabberofStocks grab) {
		super();
		this.IBMPrice = null;
		this.googPrice = null;
		this.grabber = grab;
		grab.registerObserver(this);
	}
	@Override
	public void setPrice(double IBMPrice, double googPrice) {
		// TODO Auto-generated method stub
		this.IBMPrice = IBMPrice;
		this.googPrice = googPrice;
		System.out.println("IBM Price: "+IBMPrice+" Google Price: "+ googPrice);
		
	}
	

}

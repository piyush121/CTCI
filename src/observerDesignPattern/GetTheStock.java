package observerDesignPattern;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable{
	
	private String stock;
	private StockGrabber grabber;
	private Double price;

	public GetTheStock(String stock, StockGrabber grabber, Double price) {
		super();
		this.stock = stock;
		this.grabber = grabber;
		this.price = price;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 20; i++){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 // Generates a random number between -.03 and .03
			             
		double randNum = (Math.random() * (.06)) - .03;
			             
		// Formats decimals to 2 places
			             
		DecimalFormat df = new DecimalFormat("#.##");
			             
		// Change the price and then convert it back into a double
			             
		price = Double.valueOf(df.format((price + randNum)));
			             
		if(stock == "IBM") ((StockGrabber) grabber).setIBMPrice(price);;
		if(stock == "Google") ((StockGrabber) grabber).setGoogPrice(price);
			             
		 System.out.println(stock + ": " + df.format((price + randNum)) +
			                " " + df.format(randNum));
			             
		System.out.println();
		
	}
}

}

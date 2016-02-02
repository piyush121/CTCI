package ch_17;

public class seventeen_one {

	public static void swap(Integer a,Integer b)
	{
		System.out.println(a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) {
		Integer x=4;
		Integer y=5;
		
		swap(x,y);
		
		x=y^x^(y=x);
		System.out.println(x+" "+y);
				

	}
}

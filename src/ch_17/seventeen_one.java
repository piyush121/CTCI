package ch_17;

public class seventeen_one {

	public static void swap(Integer a,Integer b)
	{
		a=a.sum(a, b);
		b=a-b;
		a=a-b;
		
	}
	public static void main(String[] args) {
		Integer x=new Integer(4);
		Integer y=new Integer(5);
		System.out.println(x+" "+y);

		swap(x,y);
		System.out.println(x+" "+y);
	}
}

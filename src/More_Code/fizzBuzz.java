package More_Code;

public class fizzBuzz {			//took exactly 1.5 mins to code.
	public static void main(String[] args) {
		for(int i=1;i<=30;i++)
		{
			if(i%15==0)
				System.out.println("Fizzbuzz : "+i);
			else if(i%3==0)
				System.out.println("Fizz : "+i);
			else if(i%5==0)
				System.out.println("Buzz : "+i);
			else
				System.out.println(i);
		}
	}

}

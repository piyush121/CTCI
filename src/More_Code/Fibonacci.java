package More_Code;

public class Fibonacci { // Crush Fibonacci number.

	public static int fibR(int n) // Old traditional,highly inefficient method.
									// O(2^n) time and O(n) space.
	{
		if (n < 0)
			throw new IllegalArgumentException();
		if (n == 0)
			return 0;

		if (n == 1 || n == 2)
			return 1;
		else
			return fibR(n - 1) + fibR(n - 2);
	}

	public static int fibDP(int n) { // Modern Dynamic programming space
										// consuming method. O(n) time and O(n)
										// space.
		if (n < 0)
			throw new IllegalArgumentException();
		int[] DP = new int[Math.max(n + 1, 3)];
		DP[0] = 0;
		DP[1] = 1;
		DP[2] = 1;
		for (int i = 3; i <= n; i++) {
			DP[i] = DP[i - 1] + DP[i - 2];
		}
		return DP[n];
	}

	public static int fib(int n) {// Best known method yet. O(n) time and O(1)
									// space.
		if (n < 0)
			throw new IllegalArgumentException();
		if (n == 0)
			return 0;
		int prevPrev = 1;
		int prev = 1;
		int curr = 2;
		for (int i = 3; i <= n; i++) {
			curr = prev + prevPrev;
			prevPrev = prev;
			prev = curr;
		}
		return prev;

	}

	public static void main(String[] args) {
		System.out.println(fibR(6));
		System.out.println(fibDP(6));
		System.out.println(fib(6));
	}

}

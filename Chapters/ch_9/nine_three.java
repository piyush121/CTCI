package ch_9;

public class nine_three {

	public static int magicIndex(int[] A, int start, int end) {
		if (start < 0 || end >= A.length || start > end)
			return -1;
		int mid = (start + end) / 2;
		if (A[mid] == mid)
			return mid;
		else if (A[mid] > mid) { // magic index cannot be between mid and
									// A[mid].
			int left1 = magicIndex(A, A[mid], end);
			if (left1 != -1)
				return left1;
			int right1 = magicIndex(A, start, mid - 1);	//We can still optimize it more and write clean code as written in the book
			if (right1 != -1)							//by using Math.max/min function. But this code also works and would have same complexity.
				return right1;							//but it's not neat. It's hard to beat gayle McDowell in terms of clean code. Hats off to you Gayle !
		} else {//// magic index cannot be between A[mid] and mid.
			int left2 = magicIndex(A, start, A[mid]);
			if (left2 != -1)
				return left2;
			int right2 = magicIndex(A, mid + 1, end);
			if (right2 != -1)
				return right2;
		}

		return -1;

	}

	public static void main(String[] args) {
		int[] A = { -10, -1, 0, 2, 2, 3, 4, 7, 9, 12, 13 };
		System.out.println(magicIndex(A, 0, A.length - 1)); //Should be 7.

	}

}

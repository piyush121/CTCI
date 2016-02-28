package ch_9;

import java.util.ArrayList;
import java.util.LinkedList;

public class nine_four { // Tedious question !
	public static ArrayList<LinkedList<Integer>> getsets(ArrayList<Integer> arr, int index) {
		ArrayList<LinkedList<Integer>> result = new ArrayList<>();

		if (index == 0) {
			LinkedList<Integer> list = new LinkedList<>();// adding one element
															// as base case
			list.add(arr.get(0));
			result.add(list);
			return result;
		}
		result = getsets(arr, index - 1);
		int val = arr.get(index);
		ArrayList<LinkedList<Integer>> more = new ArrayList<>();
		for (LinkedList<Integer> list : result) {
			LinkedList<Integer> list1 = new LinkedList<>();
			list1.addAll(list);
			list1.add(val);// append value to every list in the result set.
			more.add(list1);
		}
		result.addAll(more);
		LinkedList<Integer> temp = new LinkedList<Integer>();
		temp.add(val);// adding the value itself to the list.
		result.add(temp);

		return result;

	}

	public static void main(String[] args) {

		ArrayList<Integer> AL = new ArrayList<>();
		AL.add(1);
		AL.add(2);
		AL.add(3);
		System.out.println(getsets(AL, AL.size() - 1));
	}

}

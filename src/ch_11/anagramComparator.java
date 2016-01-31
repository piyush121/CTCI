package ch_11;

import java.util.Arrays;
import java.util.Comparator;

public class anagramComparator implements Comparator<String> {

	public static String sortChars(String str)
	{	
		char[] myarr=str.toCharArray();
		Arrays.sort(myarr);
		return new String(myarr);
	}
	@Override
	public int compare(String arg0, String arg1) {
		// TODO Auto-generated method stub
		return sortChars(arg0).compareTo(sortChars(arg1));
	}

}

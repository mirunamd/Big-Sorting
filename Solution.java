import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/* - this approach involves working directly on strings
 * - comparing each character as its int value with the other if the strings have equal lengths
 * - BigInteger is not an efficient approach to this problem as it involves converting to 
 *   integers from strings then comparing as integers 
 * - the result is stored in a String and not an array to make printing faster
 */

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());

		String[] unsorted = new String[n];
		for (int i = 0; i < n; i++)
			unsorted[i] = in.readLine();

		Arrays.sort(unsorted, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				int l1 = a.length();
				int l2 = b.length();

				if (l1 > l2)
					return 1;
				if (l1 < l2)
					return -1;

				for (int i = 0; i < l1; i++) {
					if ((int) a.charAt(i) > (int) b.charAt(i))
						return 1;
					if ((int) a.charAt(i) < (int) b.charAt(i))
						return -1;
				}
				return 0;
			}
		});

		StringBuilder result = new StringBuilder("");
		
		for (String s: unsorted)
			result.append(s + "\n");
		
		System.out.println(result);
	}
}

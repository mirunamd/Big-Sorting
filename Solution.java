import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	private static BigInteger[] a;
	private static BigInteger[] arr;

	private static void sort(int n, BigInteger[] a) {
		arr = new BigInteger[n];
		doMergeSort(0, n - 1);

		for (int i = 0; i < n; i++)
			System.out.println(a[i]);
	}

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		a = new BigInteger[n];
		for (int unsorted_i = 0; unsorted_i < n; unsorted_i++) {
			String s = in.readLine();
			a[unsorted_i] = new BigInteger(s);
		}

		sort(n, a);
	}

	private static void doMergeSort(int l, int h) {

		if (l < h) {
			int middle = l + (h - l) / 2;
			doMergeSort(l, middle);
			doMergeSort(middle + 1, h);
			mergeParts(l, middle, h);
		}
	}

	private static void mergeParts(int l, int middle, int h) {

		for (int i = l; i <= h; i++) {
			arr[i] = a[i];
		}

		int i = l;
		int j = middle + 1;
		int k = l;

		while (i <= middle && j <= h) {
			if (arr[i].compareTo(arr[j]) <= 0) {
				a[k] = arr[i];
				i++;
			} else {
				a[k] = arr[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			a[k] = arr[i];

			k++;
			i++;
		}
	}
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static BigInteger[] a;
        
    private static void sort(int n, BigInteger[] a){
        for(int i = 0; i < n - 1; i++)
            for(int j = i + 1; j < n; j++)
                if(a[i].compareTo(a[j]) == 1){
                    BigInteger bi = a[i];
                    a[i] = a[j];
                    a[j] = bi;                    
                }
        for(int i = 0; i < n; i++)
            System.out.println(a[i]);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        a = new BigInteger[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i ++){
            String s = in.readLine();
            a[unsorted_i] = new BigInteger(s);
        }
        
        sort(n, a);
    }
}
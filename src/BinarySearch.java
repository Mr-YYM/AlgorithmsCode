import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int rank(int key,int[] a){
        //Array must be sorted
        int lo = 0;
        int hi = a.length-1;
        while(lo<=hi){
            //Key is in a[lo..hi] or not present
            int mid = lo + (hi - lo)/2;
            if(key<a[mid]) hi = mid - 1;
            else if(key>a[mid]) lo = mid+1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] whitelist = new int[n];
        for (int i = 0; i < n; i++) {
            whitelist[i] = in.nextInt();
        }
        Arrays.sort(whitelist);

        while(!StdIn.isEmpty()){
            int key = StdIn.readInt();
            if(rank(key,whitelist)>0)
                StdOut.println(rank(key,whitelist));
        }
    }
}

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class RandomSeq {
    public static void main(String[] args) {
        String[] haha = new String[]{"20","2.2","3.3"};
        int N = Integer.parseInt(haha[0]);
        double lo = Double.parseDouble(haha[1]);
        double hi = Double.parseDouble(haha[2]);
        double[] x = new double[N];
        for (int i = 0; i < N; i++) {
            x[i] = StdRandom.uniform(lo,hi);
        }
        Arrays.sort(x);
        for (int i = 0; i < N; i++) {
            if(i%10==0 && i!=0)
                System.out.println();
            StdOut.printf("%.2f ",x[i]);

        }
    }
}

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
//        int n = 50;
//        double[] a = new double[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = Math.random();
//        }
//        fill(n, a);

        for (int i = 1; i <= 10000; i++) {
            System.out.printf("%4d ",i);
            if(i%20==0 && i!=0) System.out.println();
        }
    }

    private static void fill(int n, double[] a) {
        for (int i = 0; i < n; i++) {
            StdDraw.setPenColor(StdDraw.BLACK);
            if(a[i]>0.7)
                StdDraw.setPenColor(StdDraw.RED);
            double x = 1.0*i/n;
            double y = a[i]/2.0;
            double rw = 0.5/n;
            double rh = a[i]/2.0;
            StdDraw.filledRectangle(x, y,rw,rh);

        }
    }
}

import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;

public class calculatePI {
    public static void main(String[] args) {
        StdDraw.setPenRadius(.005);
        StdDraw.line(0,0.31415,1,0.31415);
        StdDraw.text(0.968,0.33415,"PI");
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.circle(0,0,1);
        int t = 1000;
        StdDraw.setPenRadius(.005);
        int n = 0;
        for (int i = 0; i < t; i++) {
            StdDraw.setPenColor(StdDraw.BLACK);
            double x = Math.random();
            double y = Math.random();
            if(x*x+y*y<1) {
                StdDraw.setPenColor(StdDraw.RED);
                n++;
            }
            StdDraw.point(x,y);
            StdDraw.setPenColor(StdDraw.GREEN);
            if(i!=0)
                StdDraw.point(i/(double)t,4*n/(double)i/10.0);
        }
        StdDraw.show();
        System.out.println(4.0*n/(double)t);
    }
}

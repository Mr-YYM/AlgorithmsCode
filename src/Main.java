import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;

import java.util.Random;



public class Main {
    public static void main(String[] args) {
        double lside = 1.5;
        StdDraw.setXscale(-lside,lside);
        StdDraw.setYscale(-lside,lside);
        StdDraw.setPenRadius(.005);
        int T = 200;
        drawAHeart(T);

//        drawASquare(5,lside);

//        drawAStar(lside);

//        double x,y=0;
//
//        long n=0,i=0;
//        for(i=0;i<10000;i++){
//            x= Math.random(); //产生0-1的随机数
//            y=Math.random();
//            if(x*x+y*y<1) n++;
//
//        }
//        System.out.println(i+":"+n);
//        double pi=4.0*n/i;
//        System.out.println(pi);
    }

    private static void drawAStar(int lside) {
        for (int i = 0; i < 1000000; i++) {
            StdDraw.setPenColor(StdDraw.BLACK);
            double x = Math.random()*2*lside-lside;
            double y = Math.random()*2*lside-lside;
            if(Math.pow(x,2/3) + Math.pow(y,2/3)<Math.pow(2,2/3))
                StdDraw.setPenColor(StdDraw.RED);
            Point2D p = new Point2D(x,y);
            p.draw();
        }
    }

    private static void drawASquare(int side ,int lside) {
        for (int i = 0; i < 1000000; i++) {
            StdDraw.setPenColor(StdDraw.BLACK);
            double x = Math.random()*2*lside-lside;
            double y = Math.random()*2*lside-lside;
            if(x*x/2+y*y/3<1)
                StdDraw.setPenColor(StdDraw.RED);
            Point2D p = new Point2D(x,y);
            p.draw();
        }
    }

    private static void drawAHeart(int T) {
        for (int t = 0; t < T; t++) {
            StdDraw.setPenColor(StdDraw.BLACK);
            double x = Math.random()*3-1.5;
            double y = Math.random()*3-1.5;
            if(Math.pow(x*x+y*y-1,3)-x*x*Math.pow(y,3)<0)
                StdDraw.setPenColor(StdDraw.RED);
            Point2D p = new Point2D(x,y);
            p.draw();
        }
    }
}

import edu.princeton.cs.algs4.StdDraw;

public class funcitonValue {
    public static void main(String[] args) {
        StdDraw.setPenRadius(.01);
        for (int i = 0; i < 100; i++) {
            StdDraw.point(0.01*i,0.01*i);
        }
    }
}

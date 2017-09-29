import edu.princeton.cs.algs4.Accumulator;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

class VisualAccumulator extends Accumulator{
    public VisualAccumulator(int trials,double max) {
        StdDraw.setXscale(0,trials);
        StdDraw.setYscale(0,max);
        StdDraw.setPenRadius(.006);
    }

    @Override
    public String toString() {
        return "Mean ("+count()+" values):"
                +String.format("%7.5f",mean());
    }

    @Override
    public void addDataValue(double x) {
        super.addDataValue(x);
        StdDraw.setPenColor(StdDraw.GRAY);
        StdDraw.point(count(),x*10000);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(count(),mean()*10000);
    }
}

public class TestVisuslAccumulator{

    public static void main(String[] args) {
        VisualAccumulator a = new VisualAccumulator(20000,10000.0);
        for (int i = 0; i < 20000; i++) {
            a.addDataValue(StdRandom.random());
        }
        StdOut.println(a);
    }
}

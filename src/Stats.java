import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Stats {
    public static void main(String[] args) {
        Bag<Double> numbers = new Bag<>();

        while (!StdIn.isEmpty())
            numbers.add(StdIn.readDouble());
        int n = numbers.size();

        double sum = 0.0;

        for (Double x : numbers) {
            sum += x;
        }
        double mean = sum/n;
        sum = 0.0;

        for (Double x : numbers) {
            sum += (x-mean)*(x-mean);
        }

        double std = Math.sqrt(sum/(n-1));

        StdOut.printf("Mean: %.2f\n",mean);
        StdOut.printf("Std dev: %.2f\n",std);
    }


}

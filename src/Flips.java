import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Scanner;

public class Flips {
    public static void main(String[] args) {
        int t = new Scanner(System.in).nextInt();
        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");
        for (int i = 0; i < t; i++) {
            if(StdRandom.bernoulli(0.6))
                heads.increment();
            else
                tails.increment();
        }
        StdOut.println(heads);
        StdOut.println(tails);
        int d  = heads.tally() - tails.tally();
        StdOut.println("delta: " + Math.abs(d));
    }
}

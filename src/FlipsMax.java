import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class FlipsMax {
    public static Counter max(Counter x, Counter y){
        return (x.tally()>y.tally()) ? x: y;
    }

    public static void main(String[] args) {
        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");
        for (int i = 0; i < 100000; i++) {
            if(StdRandom.bernoulli(0.5))
                heads.increment();
            else tails.increment();
        }
        if(heads.tally()==tails.tally())
            StdOut.println("TIE");
        else StdOut.println(max(heads,tails) + " wins");
    }
}

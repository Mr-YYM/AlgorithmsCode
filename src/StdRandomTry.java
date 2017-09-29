import edu.princeton.cs.algs4.StdRandom;

public class StdRandomTry {
    public static double uniform(double a,double b){
        return a + StdRandom.random() * (b-a);
    }

    public static void main(String[] args) {
        System.out.println(uniform(0,6));
    }
}

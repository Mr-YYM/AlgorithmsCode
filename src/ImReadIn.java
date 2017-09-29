import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Queue;

public class ImReadIn {
    public static int[] readInts(String name){
        In in = new In(name);
        Queue<Integer> q = new Queue<>();
        while(!in.isEmpty())
            q.enqueue(in.readInt());

        int n = q.size();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = q.dequeue();
        }
        return a;

    }

    public static void main(String[] args) {
        readInts(args[0]);
    }
}

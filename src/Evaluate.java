import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Evaluate {
    public static void main(String[] args){
        Stack<Character> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();
        //接受输入一个等式
        String equation = StdIn.readString();
        char[] signs = equation.toCharArray();
        for(Character each_sign : signs){
            if      (each_sign.equals('('));
            else if (each_sign.equals('+'))     ops.push(each_sign);
            else if (each_sign.equals('-'))     ops.push(each_sign);
            else if (each_sign.equals('*'))     ops.push(each_sign);
            else if (each_sign.equals('/'))     ops.push(each_sign);
            else if (each_sign.equals(')')){
                Character op = ops.pop();
                double v = vals.pop();
                if(op.equals('+'))      v = vals.pop() + v;
                if(op.equals('-'))      v = vals.pop() - v;
                if(op.equals('*'))      v = vals.pop() * v;
                if(op.equals('/'))      v = vals.pop() / v;
                vals.push(v);
            }
            else vals.push(Double.parseDouble(String.valueOf(each_sign)));

        }
        StdOut.println(vals.pop());
    }
}

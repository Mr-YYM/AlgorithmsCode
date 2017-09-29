import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;


public class EasyEvaluate {
    String operator;

    public EasyEvaluate(String operator) {
        this.operator = operator;
    }

    int count(int a,int b){
        switch (operator){
            case "\\+":
                return a+b;
            case "\\-":
                return a-b;
            case "\\*":
                return a*b;
            case "\\/":
                return a/b;
        }
        throw new IllegalArgumentException("您的输入有误！！");
    }

    public static void main(String[] args) {
        //接受输入一个等式
        String equation = StdIn.readString();
        //得到运算符
        String operator = getOperator(equation);
        //得到两个运算数
        String[] nums = equation.split(operator);
        int num1 = Integer.parseInt(nums[0]);
        int num2 = Integer.parseInt(nums[1]);
        //得到并输出结果
        int result = new EasyEvaluate(operator).count(num1, num2);
        StdOut.println(result);

    }

    private static String getOperator(String equation) {
        char[] eachSymbol = equation.toCharArray();
        for (char c : eachSymbol) {
            if(!Character.isDigit(c)){
                char operator = c;
                return "\\" + String.valueOf(operator);
            }
        }
        throw new IllegalArgumentException("您的输入有误！！");
    }
}

package IteratorTry;

import java.util.ArrayList;
import java.util.Iterator;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hehe");

        Iterator<String> i = list.iterator();
        while (i.hasNext()) {
            String s = i.next();
        }
    }
}

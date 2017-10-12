import java.util.Scanner;

public class Stack<Item> {
    private Node first;
    private int n;

    private class Node{
        Item item;
        Node next;
    }

    public boolean isEmpty(){ return first==null; }
    public int size(){ return n; }

    public void push(Item item){
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        n++;
    }

    public Item pop(){
        Item item = first.item;
        first = first.next;
        n--;
        return item;
    }

    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            s.push(in.nextLine());
        }
        System.out.printf("链表中有%d个元素，他们分别是\n",s.size());

        for (int i = 0; i < 10; i++) {
            System.out.println(s.pop());
        }

    }
}

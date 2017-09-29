public class List<E> {
    E[] data;
    int last;

    public List(E[] data) {
        this.data = data;
    }

    public List() {

    }

    List MakeEmpty(){
        data = (E[]) new Object[100];
        this.last = -1;
        return new List<E>(data);
    }

    E FindKth(int k , List<E> l){

        return null;
    }

    int Find(E x,List<E> l){
        for (int i = 0; i < l.data.length; i++) {
            if(l.data[i].equals(x))
                return i;
        }
        return -1;
    }

    void insert(E x,int i,List<E> l){
        if(l.last == 99) {
            System.out.println("表满");
            return;
        }
        for (int j = last; j >= i; j--) {
            l.data[j+1] = l.data[j];
        }
        l.data[i] = x;
        last++;
        return;
    }

    void delete(int i,List<E> l){

    }

    int length(List<E> l){

        return 0;
    }

    public static void main(String[] args) {
        List<String> stringList = new List<>();
        List a = stringList.MakeEmpty();
        a.insert("你好",0,a);
        a.insert("我好",0,a);
    }
}

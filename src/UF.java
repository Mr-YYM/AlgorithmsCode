public class UF {
    private int[] id;
    private int count;

    public UF(int n){
        count = n;
        id = new int[n];
        for (int i = 0; i < n; i++)
            id[i] = i;
    }

    public int getCount() {
        return count;
    }

    public boolean connented(int p,int q){
        return find(p)==find(q);
    }

    public int find(int p){
        return id[p];
    }

    public void union(int p,int q){
        int pID = find(p);
        int qID = find(q);

        if(pID==qID) return;

        for (int i = 0; i < id.length; i++) {
            if(id[i]==pID) id[i] = qID;

        }
        count--;
    }


    public static void main(String[] args) {

    }
}

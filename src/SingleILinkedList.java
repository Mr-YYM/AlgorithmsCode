public class SingleILinkedList<T> implements ILinkedList<T> {
    protected Node<T> head; //������ͷ���

    public SingleILinkedList(Node<T> head) {
        this.head = head;
    }

    /**
     * �ж������Ƿ�Ϊ��
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return this.head==null;
    }

    /**
     * ������
     *
     * @return
     */
    @Override
    public int length() {
        int length=0;//��ǳ��ȵı���
        Node<T> p=head;//����pָ��ͷ���
        while (p!=null){
            length++;
            p=p.next;//��̽�㸳ֵ��p����������
        }
        return length;
    }

    /**
     * ����index������ȡֵ
     * @param index �±�ֵ��ʼֵΪ0
     * @return
     */
    @Override
    public T get(int index) {

        if(this.head != null && index >=0){
            int count=0;
            Node<T> p=this.head;
            //�ҵ���Ӧ�����Ľ��
            while (p!=null && count<index){
                p=p.next;
                count++;
            }

            if(p!=null){
                return p.data;
            }
        }
        return null;
    }

    /**
     * ���������滻��Ӧ����data
     * @param index �±��0��ʼ
     * @param data
     * @return ���ؾ�ֵ
     */
    @Override
    public T set(int index, T data) {

        if(this.head!=null&&index>=0&&data!=null){
            Node<T> pre=this.head;
            int count=0;
            //������Ҫ�滻�Ľ��
            while (pre!=null&&count<index){
                pre=pre.next;
                count++;
            }
            //��Ϊ��ֱ���滻
            if (pre!=null){
                T oldData=pre.data;
                pre.data=data;//������ֵ
                return oldData;
            }

        }
        return null;
    }

    /**
     * �����±���ӽ��
     * 1.ͷ������
     * 2.�м����
     * 3.ĩβ����
     * @param index �±�ֵ��0��ʼ
     * @param data
     * @return
     */
    @Override
    public boolean add(int index, T data) {

        if (data==null){
            return false;
        }
        //��ͷ������
        if (this.head==null||index<1){
            this.head = new Node<T>(data, this.head);
        }else {
            //��β�����м����
            int count=0;
            Node<T> front=this.head;
            //�ҵ�Ҫ������λ�õ�ǰһ�����
            while (front.next!=null&&count<index-1){
                front=front.next;
                count++;
            }
            //β����Ӻ��м��������ͬ�����,�Ͼ���frontΪβ�����ʱfront.next=null
            front.next=new Node<T>(data,front.next);
        }
        return true;
    }

    /**
     * ��ӽ��
     *
     * @param data
     * @return
     */
    @Override
    public boolean add(T data) {
        return false;
    }

    /**
     * ��������ɾ�����
     * @param index
     * @return
     */
    @Override
    public T remove(int index) {

        T old=null;

        if (this.head!=null&&index>=0){

            //ֱ��ɾ������ͷ���
            if(index==0){
                old=this.head.data;
                this.head=this.head.next;
            }else {

                Node<T> front = this.head;
                int count = 0;
                //������Ҫɾ������ǰһ�����
                while (front.next != null && count < index - 1) {
                    front = front.next;
                    count++;
                }

                //��ȡ��Ҫɾ���Ľ��
                Node<T> r = front.next;

                if ( r!= null) {
                    //��ȡ��ֵ
                    old =r.data;
                    //����ָ��ָ��
                    front.next=r.next;
                    //�ͷ�
                    r=null;
                }
            }
        }
        return old;
    }

    /**
     * ����data�Ƴ����
     *
     * @param data
     * @return
     */
    @Override
    public boolean removeAll(T data) {
        return false;
    }

    /**
     * �������
     */
    @Override
    public void clear() {

    }

    /**
     * �Ƿ����data���
     *
     * @param data
     * @return
     */
    @Override
    public boolean contains(T data) {
        return false;
    }

    public static void main(String[] args) {
        SingleILinkedList<Integer> i = new SingleILinkedList<>(new Node<Integer>(0));
        i.add(0,20);
        i.add(0,10);
        i.add(2,3);
        i.add(1,115);
    }

}
public class SingleILinkedList<T> implements ILinkedList<T> {
    protected Node<T> head; //带数据头结点

    public SingleILinkedList(Node<T> head) {
        this.head = head;
    }

    /**
     * 判断链表是否为空
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return this.head==null;
    }

    /**
     * 链表长度
     *
     * @return
     */
    @Override
    public int length() {
        int length=0;//标记长度的变量
        Node<T> p=head;//变量p指向头结点
        while (p!=null){
            length++;
            p=p.next;//后继结点赋值给p，继续访问
        }
        return length;
    }

    /**
     * 根据index索引获取值
     * @param index 下标值起始值为0
     * @return
     */
    @Override
    public T get(int index) {

        if(this.head != null && index >=0){
            int count=0;
            Node<T> p=this.head;
            //找到对应索引的结点
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
     * 根据索引替换对应结点的data
     * @param index 下标从0开始
     * @param data
     * @return 返回旧值
     */
    @Override
    public T set(int index, T data) {

        if(this.head!=null&&index>=0&&data!=null){
            Node<T> pre=this.head;
            int count=0;
            //查找需要替换的结点
            while (pre!=null&&count<index){
                pre=pre.next;
                count++;
            }
            //不为空直接替换
            if (pre!=null){
                T oldData=pre.data;
                pre.data=data;//设置新值
                return oldData;
            }

        }
        return null;
    }

    /**
     * 根据下标添加结点
     * 1.头部插入
     * 2.中间插入
     * 3.末尾插入
     * @param index 下标值从0开始
     * @param data
     * @return
     */
    @Override
    public boolean add(int index, T data) {

        if (data==null){
            return false;
        }
        //在头部插入
        if (this.head==null||index<1){
            this.head = new Node<T>(data, this.head);
        }else {
            //在尾部或中间插入
            int count=0;
            Node<T> front=this.head;
            //找到要插入结点位置的前一个结点
            while (front.next!=null&&count<index-1){
                front=front.next;
                count++;
            }
            //尾部添加和中间插入属于同种情况,毕竟当front为尾部结点时front.next=null
            front.next=new Node<T>(data,front.next);
        }
        return true;
    }

    /**
     * 添加结点
     *
     * @param data
     * @return
     */
    @Override
    public boolean add(T data) {
        return false;
    }

    /**
     * 根据索引删除结点
     * @param index
     * @return
     */
    @Override
    public T remove(int index) {

        T old=null;

        if (this.head!=null&&index>=0){

            //直接删除的是头结点
            if(index==0){
                old=this.head.data;
                this.head=this.head.next;
            }else {

                Node<T> front = this.head;
                int count = 0;
                //查找需要删除结点的前一个结点
                while (front.next != null && count < index - 1) {
                    front = front.next;
                    count++;
                }

                //获取到要删除的结点
                Node<T> r = front.next;

                if ( r!= null) {
                    //获取旧值
                    old =r.data;
                    //更改指针指向
                    front.next=r.next;
                    //释放
                    r=null;
                }
            }
        }
        return old;
    }

    /**
     * 根据data移除结点
     *
     * @param data
     * @return
     */
    @Override
    public boolean removeAll(T data) {
        return false;
    }

    /**
     * 清空链表
     */
    @Override
    public void clear() {

    }

    /**
     * 是否包含data结点
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
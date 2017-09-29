public interface ILinkedList<T> {
    /**
     * �ж������Ƿ�Ϊ��
     * @return
     */
    boolean isEmpty();

    /**
     * ������
     * @return
     */
    int length();

    /**
     * ��ȡԪ��
     * @param index
     * @return
     */
    T get(int index);

    /**
     * ����ĳ�����ĵ�ֵ
     * @param index
     * @param data
     * @return
     */
    T set(int index, T data);

    /**
     * ����index��ӽ��
     * @param index
     * @param data
     * @return
     */
    boolean add(int index, T data);

    /**
     * ��ӽ��
     * @param data
     * @return
     */
    boolean add(T data);

    /**
     * ����index�Ƴ����
     * @param index
     * @return
     */
    T remove(int index);

    /**
     * ����data�Ƴ����
     * @param data
     * @return
     */
    boolean removeAll(T data);

    /**
     * �������
     */
    void clear();

    /**
     * �Ƿ����data���
     * @param data
     * @return
     */
    boolean contains(T data);

    /**
     * �����ʽ
     * @return
     */
    String toString();
}
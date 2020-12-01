package MyCode.Week_03;


public class LinkedList<E> {
    private class Node{
        E e;
        Node next;

        public Node(E e,Node next){
            this.e = e;
            this.next = next;
        }
        public Node(E e){
            this(e ,null);
        }
        public Node(){
            this(null,null);
        }
        @Override
        public String toString(){
            return e.toString();
        }
    }

    private Node dummyHead;
    private int size;

    public LinkedList(){
        dummyHead = new Node(null,null);
        size = 0;
    }

    /**
     * 获取链表中元素个数
     * @return
     */
    public int getSize(){
        return size;
    }

    /**
     * 判断链表是否为空
     * @return
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * 向链表指定索引index处添加元素
     * @param index
     * @param e
     */
    public void add(int index,E e){
        if(index < 0 || index > size )
            throw new IllegalArgumentException("下标错误！");
        Node pre = dummyHead;
        for(int i = 0; i < index;i++){
            pre = pre.next;
        }
        pre.next = new Node(e,pre.next);
        size++;
    }

    /**
     * 向链表头添加元素
     * @param e
     */
    public void addFirst(E e){
        add(0,e);
    }

    /**
     * 向链表尾添加元素
     * @param e
     */
    public void addLast(E e){
        add(size,e);
    }

    /**
     * 获取链表中索引为index的元素
     * @param index
     * @return
     */
    public E get(int index){
        if(index < 0 || index >=size)
            throw new IllegalArgumentException("下标错误！");
        Node cur = dummyHead.next;
        for(int i = 0; i <= index;i++){
            cur = cur.next;
        }
        return cur.e;
    }

    /**
     * 删除链表中索引为index的元素
     * @param index
     * @return
     */
    public E remove(int index){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("下标错误！");
        Node pre = dummyHead;
        for(int i = 0; i < index; i++){
            pre = pre.next;
        }
        Node cur = pre.next;
        pre.next = cur.next;
        cur.next = null;
        size --;
        return cur.e;
    }

    /**
     * 删除链表头结点
     * @return
     */
    public E removeFirst(){
        return remove(0);
    }

    /**
     * 删除链表尾结点
     * @return
     */
    public E removeLast(){
        return remove(size - 1);
    }

    /**
     * 判断链表中是否含有元素e
     * @param e
     * @return
     */
    public boolean constains(E e){
        Node cur = dummyHead.next;
        while(cur != null){
            if( cur.e.equals(e))
                return true;
            cur = cur.next;
        }
        return false;
    }

    /**
     * 修改链表中下标为index处的元素的值
     * @param index
     * @param e
     */
    public void set(int index,E e){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("下标错误！");
        Node pre = dummyHead;
        for(int i = 0 ; i < index; i ++){
            pre = pre.next;
        }
        pre.next.e = e;
    }
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("LinkedList: ");
        Node cur = dummyHead.next;
        while(cur != null){
            builder.append(cur + "->");
            cur = cur.next;
        }
        builder.append("NULL");
        return builder.toString();
    }

}

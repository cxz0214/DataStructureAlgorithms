package MyCode.Week_02.Queue;

public class LoopQueue<E> implements Queue<E> {
    private E[] array;
    private int front,tail;
    private int size;

    public LoopQueue(int capacity){
        array = (E[])new Object[capacity+1];
        front = tail = 0;
        size = 0;
    }
    public LoopQueue(){
        array = (E[])new Object[10];
        front = tail = 0;
        size = 0;
    }

    /**
     * 循环队列入队
     * @param e
     */
    @Override
    public void enqueue(E e) {
        if((tail+1)%array.length == front)
            resize(2*getCapacity());
        array[tail] = e;
        tail = (tail + 1) % array.length;
        size ++;
    }

    /**
     * 循环队列出队
     * @return
     */
    @Override
    public E dequeue() {
        if(front == tail)
            throw new IllegalArgumentException("队列为空，无法出队！");
        E result = array[front];
        array[front] = null;
        front = (front + 1) % array.length;
        size --;
        if(getSize() == getCapacity()/4)
            resize(getCapacity()/2);
        return result;
    }

    /**
     * 获取队首元素
     * @return
     */
    @Override
    public E getFront() {
        if(front == tail)
            throw new IllegalArgumentException("队列为空，无法出队！");
        return array[front];
    }

    /**
     * 返回队列中当前存储的元素个数
     * @return
     */
    @Override
    public int getSize() {
        return size;
    }

    /**
     * 判断队列是否为空
     * @return
     */
    @Override
    public boolean isEmpty() {
        return false;
    }

    /**
     * 获取队列容量
     * @return
     */
    public int getCapacity(){
        return array.length - 1;
    }

    /**
     * 扩容/缩容
     * @param newCapacity
     */
    private void resize(int newCapacity){
        E[] newArray = (E[])new Object[newCapacity + 1];
        for(int i = 0; i < getSize();i++){
            newArray[i] = array[(i + front)%array.length];
        }
        array = newArray;
        front = 0;
        tail = size;
    }
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("LoopQueue:front [ ");
        for(int i = 0; i < size - 1 ; i++ ){
            builder.append(array[(i+front)%array.length]);
            builder.append(",");
        }
        builder.append(array[(size-1 +front)% array.length]);
        builder.append("] tail");
        return builder.toString();
    }
}

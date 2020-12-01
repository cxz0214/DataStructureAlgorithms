package MyCode.Week_02.Queue;

public class LoopDeque<E> implements Deque<E> {
    private E[] array;
    private int front, tail;
    private int size;

    public LoopDeque(int capacity){
        array = (E[])new Object[capacity + 1];
    }
    public LoopDeque(){
        this(10);
    }

    @Override
    public boolean isEmpty() {
        return front == tail;
    }

    @Override
    public void addFirst(E e) {
        if((tail + 1)%array.length == front)
            resize(2*getCapacity());
        if(isEmpty()){
            array[front] = e;
            tail ++;
        }
        else{
            if(front == 0){
                front = array.length - 1;
                array[front] = e;
            }
            else{
                front = front - 1;
                array[front] = e;

            }
        }
        size ++;
    }

    @Override
    public void addLast(E e) {
        if((tail + 1)%array.length == front)
            resize(2*getCapacity());
        array[tail] = e;
        tail = (tail + 1) % array.length;
        size ++;
    }

    @Override
    public E removeFirst() {
        if(isEmpty())
            throw new IllegalArgumentException("队列为空！");
        E result = array[front];
        array[front] = null;
        front = (front + 1)%array.length;
        size--;
        return result;
    }

    @Override
    public E removeLast() {
        if(isEmpty())
            throw new IllegalArgumentException("队列为空！");
        E result = null;
        if(tail == 1){
           result = array[0];
           array[0] = null;
           tail = 0;
        }
        else if(tail == 0){
            result = array[array.length - 1];
            array[array.length - 1] = null;
            tail = array.length - 1;
        }
        else{
            result = array[tail - 1];
            array[tail - 1] = null;
            tail--;
        }
        size --;
        return result ;
    }

    @Override
    public int getSize() {
        return size;
    }
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("LoopDeque front: [ ");
        for(int i = 0; i < size; i++){
            builder.append(array[(front + i)% array.length]);
            if(i != size - 1)
                builder.append(",");
        }
        builder.append("] tail");
        return builder.toString();
    }
    private int  getCapacity(){
        return array.length - 1;
    }
    private void resize(int newCapacity){
        E[] newArray = (E[])new Object[newCapacity + 1];
        for(int i = 0 ; i < getSize();i++){
            newArray[i] = array[(i+front)%array.length];
        }
        array = newArray;
        front = 0;
        tail = size;
    }
}

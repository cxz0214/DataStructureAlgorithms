package MyCode.Week_02.Queue;

import MyCode.Week_02.Array.Array;

public class ArrayQueue<E> implements Queue<E> {
    private Array<E> array;

    public ArrayQueue(int capacity){
        array = new Array<>(capacity);
    }
    public ArrayQueue(){
        array = new Array<>();
    }

    @Override
    public void enqueue(E e) {
        array.addLast(e);
    }

    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    @Override
    public E getFront() {
        return array.getFirst();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("Queue:front [");
        for(int i = 0 ; i < array.getSize() - 1; i++){
            str.append(array.get(i));
            str.append(",");
        }
        str.append(array.get(getSize() - 1));
        str.append("] tail");
        return str.toString();
    }
}

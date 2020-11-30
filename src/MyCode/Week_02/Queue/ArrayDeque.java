package MyCode.Week_02.Queue;

import MyCode.Week_02.Array.Array;

public class ArrayDeque<E> implements Deque<E> {
    private Array<E> array;
    public ArrayDeque(int capacity) {
        array = new Array<>(capacity);
    }
    public ArrayDeque(){
        array = new Array<>();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void addFirst(E e) {
        array.addFirst(e);
    }

    @Override
    public void addLast(E e) {
        array.addLast(e);
    }

    @Override
    public E removeFirst() {
        return array.removeFirst();
    }

    @Override
    public E removeLast() {
        return array.removeLast();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("ArrayDeque: front [");
        for(int i = 0; i < array.getSize();i++){
            builder.append(array.get(i));
            if(i != array.getSize() - 1)
                builder.append(",");
        }
        builder.append("] tail");
        return builder.toString();
    }
}

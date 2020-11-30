package MyCode.Week_02.Queue;

public interface Deque<E> {
    boolean isEmpty();
    void addFirst(E e);
    void addLast(E e);
    E removeFirst();
    E removeLast();
    int getSize();
}

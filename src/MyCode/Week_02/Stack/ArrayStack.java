package MyCode.Week_02.Stack;
import MyCode.Week_02.Array.*;
public class ArrayStack<E> implements Stack<E> {

    Array<E> array;

    public ArrayStack(int capacity){
        array = new Array<>(capacity);
    }
    public ArrayStack(){
        array = new Array<>();
    }
    @Override
    public void push(E e) {
        array.addLast(e);
    }

    @Override
    public E pop() {
        return array.removeLast();
    }

    @Override
    public E peek() {
        return array.getLast();
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
        StringBuilder builder = new StringBuilder();
        builder.append("Stack : [ ");
        for(int i = 0 ; i < array.getSize() - 1;i++){
            builder.append(array.get(i));
            builder.append(",");
        }
        builder.append(array.getLast());
        builder.append("] top");
        return builder.toString();
    }
}

package MyCode.Week_02.Queue;

public class Test {
    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>(20);
        for(int i = 0; i < 20; i++){
            queue.enqueue(i);
        }
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue.getFront());
        System.out.println(queue);
    }
}

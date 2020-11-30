package MyCode.Week_02.Queue;

public class Test {
    public static void main(String[] args) {
//        ArrayQueue<Integer> queue = new ArrayQueue<>(20);
//        for(int i = 0; i < 20; i++){
//            queue.enqueue(i);
//        }
//        System.out.println(queue);
//        System.out.println(queue.dequeue());
//        System.out.println(queue.getFront());
//        System.out.println(queue);
//        LoopQueue<Integer> loopQueue = new LoopQueue<>(20);
//        for(int i = 0; i < 20;i++){
//            loopQueue.enqueue(i);
//        }
//        System.out.println(loopQueue);
//        loopQueue.dequeue();
//        System.out.println(loopQueue);
//        loopQueue.dequeue();
//        loopQueue.dequeue();
//        loopQueue.dequeue();
//        loopQueue.dequeue();
//        loopQueue.dequeue();
//        System.out.println(loopQueue);
//        loopQueue.enqueue(20);
//        loopQueue.enqueue(21);
//        System.out.println(loopQueue);
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        for (int i = 0; i < 5; i++) {
            arrayDeque.addFirst(i);
        }
        for (int i = 5; i < 10; i++) {
            arrayDeque.addLast(i);
        }
        System.out.println(arrayDeque);
        int i = 0;
        while(i < 5){
            arrayDeque.removeLast();
            i++;
        }
        System.out.println(arrayDeque);
        int j = 0;
        while(j < 3){
            arrayDeque.removeFirst();
            j++;
        }
        System.out.println(arrayDeque);

    }
}

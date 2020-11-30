package MyCode.Week_02.Queue;

import java.sql.Time;
import java.util.Random;

public class Main {
    public static double testQueue(Queue<Integer> q,int count){
        long startTime = System.nanoTime();
        Random random = new Random();
        for(int i = 0; i < count;i++)
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        for(int i = 0; i < count;i++)
            q.dequeue();
        long endTime = System.nanoTime();
        return (endTime - startTime)/1000000000.0;
    }

    public static void main(String[] args) {
        LoopQueue<Integer>loopQueue = new LoopQueue<>();
        double time2 = testQueue(loopQueue,100000000);
        System.out.println(String.format("循环列表一百万次出入队操作耗时：%f s",time2));
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        double time1 = testQueue(arrayQueue,10000);
        System.out.println(String.format("数组列表一百万次出入队操作耗时：%f s",time1));

    }
}

package CourseCode.Week_01;

import java.util.Arrays;
import java.util.Random;

public class ArrayGenerator {
    public static Integer[] GeneratorRandomArray(int n,int bound){
        Integer[] arr = new Integer[n];
        Random random = new Random();
        for(int i =0;i < n;i++)
            arr[i] = random.nextInt(bound);
        return arr;
    }
    public static Integer[] GeneratorOrderArray(int capacity,int n){
        Random random = new Random();
        Integer[] arr = new Integer[capacity];
        for(int i = 0;i < arr.length;i++){
            arr[i] = i;
        }

        for(int i = 0; i < n;i++){
            swap(arr,random.nextInt(capacity),random.nextInt(capacity));
        }
        return arr;
    }
    private static <E> void swap(E[] arr,int i ,int j){
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] arr = GeneratorOrderArray(20,2);
        System.out.println(Arrays.toString(arr));
    }
}

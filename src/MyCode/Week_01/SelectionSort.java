package MyCode.Week_01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort<T>{
    static <E extends Comparable<E>> void sort(E[] arr){
        for(int i = arr.length-1; i >= 0;i--){
            int maxIndex = i;
            for(int j = i;j >= 0;j--){
               if(arr[j].compareTo(arr[maxIndex]) > 0){
                   maxIndex = j;
               }
            }
            swap(arr,i,maxIndex);
        }
    }
    static <E> void swap(E[] arr,int i,int j){
        E t = arr[i];
        arr[i] =arr[j];
        arr[j] =t;
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("alex",234),
                new Student("Mike",30),
                new Student("alex3",44),
                new Student("Mike1",5),
                new Student("alex1",35),
                new Student("Mike2",475)
        };
        System.out.println(Arrays.toString(students));
        sort(students);
        System.out.println(Arrays.toString(students));

    }
}

package CourseCode.Week_01;

import java.util.Arrays;

public class InsertionSort {
    private InsertionSort(){}
    //选择排序的一点点优化
    public static <E extends Comparable<E>> void sort(E[] arr){
        for(int i = 0; i < arr.length;i++){
            E temp = arr[i];
            int j;
            for(j = i; j-1>=0 && temp.compareTo(arr[j-1])<0;j--){
                arr[j] = arr[j-1];
            }
            arr[j] = temp;
        }
    }

    //选择排序的使用位置交换
    public static <E extends Comparable<E>> void sort2(E[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j -1>=0 && arr[j].compareTo(arr[j-1])<0;j--)
                swap(arr,j, j-1);
        }
    }
    private static <E> void swap(E[] arr,int i ,int j){
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] dataSize = {10000,100000};
        for(int n: dataSize){
            System.out.println("RandomArray");
            Integer[] arr = ArrayGenerator.GeneratorRandomArray(n,n );
            Integer[] arr2 = Arrays.copyOf(arr,arr.length);
            SortHelper.SortTest("InsertionSort",arr);
            SortHelper.SortTest("SelectionSort",arr2);
            System.out.println("OrderedArray:");
            Integer[] arr3 = ArrayGenerator.GeneratorOrderArray(n,0);
            Integer[] arr4 = Arrays.copyOf(arr3,arr3.length);
            SortHelper.SortTest("InsertionSort",arr);
            SortHelper.SortTest("SelectionSort",arr2);

        }

    }
}

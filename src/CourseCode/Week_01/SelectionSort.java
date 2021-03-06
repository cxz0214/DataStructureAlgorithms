package CourseCode.Week_01;

import java.lang.reflect.Array;
import java.sql.Time;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;

public class SelectionSort {
    private SelectionSort() {
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0)
                    minIndex = j;
            }
            swap(arr, i, minIndex);
        }
    }

    private static <E> void swap(E[] arr, int i, int j) {
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] arr = ArrayGenerator.GeneratorRandomArray(1000, 1000);
        SortHelper.SortTest("SelectionSort",arr);
    }


}

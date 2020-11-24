package CourseCode.Week_01;

import MyCode.Week_01.InsertSort;

public class SortHelper {
    private SortHelper(){}
    public static <E extends Comparable<E>> boolean isSorted(E[] arr){
        for(int i = 1; i < arr.length;i++){
            if(arr[i-1].compareTo(arr[i])>0)
                return false;
        }
        return true;
    }
    public static <E extends Comparable<E>> void SortTest(String name,E[] arr){
        //Integer[] arr = ArrayGenerator.GeneratorRandomArray(100000, 10000);
        long startTime = System.nanoTime();
        if(name.equals("SelectionSort"))
            SelectionSort.sort(arr);
        else if(name.equals("InsertionSort2"))
            InsertionSort.sort2(arr);
        else if(name.equals("InsertionSort"))
            InsertionSort.sort(arr);
        long endTime = System.nanoTime();
        if (!SortHelper.isSorted(arr))
            throw new RuntimeException(name +"faild!");

        double time = (endTime - startTime) / 1000000000.0;
        System.out.format(String.format("%s, n = %d : %f s \n",name,arr.length,time));
    }
}

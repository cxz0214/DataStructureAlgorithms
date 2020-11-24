package MyCode.Week_01;
import CourseCode.Week_01.ArrayGenerator;
import CourseCode.Week_01.SortHelper;
public class InsertSort {
    private InsertSort(){}
    public static <E extends Comparable<E>> void sort(E[] arr){
        for(int i = 0; i < arr.length -1;i++){
            E temp = arr[i];
            int index =i;
            for(int j = i+1;j>0 && arr[j].compareTo(arr[j-1])<0 ;j--){
                //swap(arr,j,j-1);
                arr[j] = arr[j-1];
                index =j;
            }
            arr[index] = temp;
        }
    }
    private static <E> void swap(E[] arr,int i,int j){
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] dataSize ={10000,1000};
        for(int n: dataSize){
            Integer[] arr = ArrayGenerator.GeneratorRandomArray(n,n);
            SortHelper.SortTest("InsertSort",arr);
        }

    }
}

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,2,3,4,1};
        bSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void bSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 1; j < arr.length; j++){
                if(arr[j] < arr[j-1]) swap(arr,j-1,j);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}

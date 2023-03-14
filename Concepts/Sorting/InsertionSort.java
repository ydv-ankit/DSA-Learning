import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {33,41,11,53,23,27,8,43,25};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++){
            for (int j = i+1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }
    }
}

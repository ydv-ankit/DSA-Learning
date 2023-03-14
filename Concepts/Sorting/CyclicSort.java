import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 6, 1, 4, 8, 5, 7, 2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                int tmp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = tmp;
            }
            else{
                i++;
            }
        }
    }
}

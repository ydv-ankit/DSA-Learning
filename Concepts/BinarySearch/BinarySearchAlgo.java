import java.util.Arrays;

public class BinarySearchAlgo {
    public static void main(String[] args) {
        int[] arr = {8, 11, 23, 25, 27, 33, 41, 43, 53};
        int target = 25;
        int index = search(arr, target);
        System.out.println(search(arr, 23));
    }

    private static int search(int[] arr, int target) {
        int start = 0, end = arr.length, mid = start + (end - start)/2;
        while(start < end){
            if(target < arr[mid]){
                end = mid - 1;
                mid = start + (end - start)/2;
            }
            else if(target == arr[mid]){
                return mid;
            }
            else{
                start = mid + 1;
                mid = start + (end - start)/2;
            }
        }
        return -1;
    }
}

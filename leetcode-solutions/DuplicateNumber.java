public class DuplicateNumber{
    public int findDuplicate(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[correct] != arr[i]) {
                int tmp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = tmp;
            } else {
                i++;
            }
        }
        // sorting done...
        int dup = 0;
        for (i = 0; i < arr.length; i++){
            if(arr[i] != i+1){
                dup = arr[i];
                break;
            }
        }
        return dup;
    }
}
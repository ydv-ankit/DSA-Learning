// https://leetcode.com/problems/missing-number/
public class MissingNumber {
    public int missingNumber(int[] arr) {

        // sort numbers using cyclic sort...
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if(correct == arr.length){
                i++;
            }
            else if(arr[correct]!=arr[i]){
                int tmp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = tmp;
            }
            else{
                i++;
            }
        }
        // sorting done...
        // checks which number isn't matching with its index
        int missing = arr.length;
        for(i = 0; i < arr.length; i++){
            if(arr[i] != i){
                missing = i;
                break;
            }
        }
        return missing;
    }
}

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class DisappearedNumber{
    public List<Integer> findDisappearedNumbers(int[] arr) {
        
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

        List<Integer> ans = new ArrayList<>();
        for(i = 0; i < arr.length; i++){
            if(arr[i] != i+1){
                ans.add(i+1);
            }
        }
        return ans;
    }
}
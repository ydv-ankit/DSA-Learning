public class AllDuplicates{
    public List<Integer> findDuplicates(int[] arr) {
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
        List<Integer> ans = new ArrayList<>();
        for (i = 0; i < arr.length; i++){
            if(arr[i] != i+1){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}
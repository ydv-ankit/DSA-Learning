// returns number whose duplicate isn't present

public class SingleAppear {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2,4,6,6,1};
        System.out.println(appear(arr));
    }

    private static int appear(int[] arr){
        int ans=0;
        for (int i = 0; i < arr.length; i++){
            ans = ans ^ arr[i];
        }
        return ans;
    }
}

/*
    XOR with number itself leads to zero and XOR with 0 gives that number itself
    So, numbers will XOR with their duplicates giving zero and leaving single appeared number behind
*/
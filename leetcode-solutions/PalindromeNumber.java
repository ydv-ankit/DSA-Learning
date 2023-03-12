// https://leetcode.com/problems/palindrome-number/
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        char start, end;
        for(int i = 0; i < String.valueOf(x).length(); i++){
            start = String.valueOf(x).charAt(i);
            end = String.valueOf(x).charAt(String.valueOf(x).length() - 1 -i);
            if(start != end){
                return false;
            }
        }
        return true;
    }
}

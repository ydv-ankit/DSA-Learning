// https://leetcode.com/problems/valid-palindrome/

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z' || ch>='a' && ch <= 'z'||ch>='0' && ch<='9') {
                str.append(ch);
            }
        }
        String f = str.toString().toLowerCase();
        char start, end;
        for (int i = 0; i < f.length() / 2 ; i++){
            start = f.charAt(i);
            end = f.charAt(f.length() - 1 - i);
            if(start != end){
                return false;
            }
        }
        return true;
    }
}

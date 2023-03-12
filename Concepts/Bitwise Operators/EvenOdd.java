// checks if number is even or not using bitwise operator
public class EvenOdd {
    public static void main(String[] args){
        System.out.println(isEven(47));
    }
    private static boolean isEven(int num){
        return (num & 1) != num;    // (num & 1) will give number itself if it is odd
    }
}
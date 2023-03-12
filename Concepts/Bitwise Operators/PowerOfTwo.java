public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isTwo(1024));
    }
    private static boolean isTwo(int n){
        if(n == 0) return false;
        return (n & (n-1)) ==0;
    }
}
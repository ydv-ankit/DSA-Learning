public class PowerAtoB {
    public static void main(String[] args) {
        System.out.println(power(32,4));
    }
    private static long power(int base, int pow){
        long ans = 1;
        while(pow > 0){
            if((pow & 1) == 1) ans = ans * base;
            base *= base;
            pow = pow >> 1;
        }
        return ans;
    }
}

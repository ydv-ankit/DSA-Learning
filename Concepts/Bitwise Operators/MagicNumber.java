// find nth Magic number
public class MagicNumber {
    public static void main(String[] args) {
        int num = 10;
        int base = 5;
        int ans = 0;
        while (num > 0) {
            int last = num & 1;
            ans += last * base;
            base = base * 5;
            num = num >> 1;
        }
        System.out.println(ans);
    }
}
/*
    num & 1 gives last bit value, product with current base is stored in 'ans' and last with replaced
    with its previous bit until num becomes 0, i.e., no bits available
 */
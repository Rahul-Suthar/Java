import java.util.*;

public class Leetcode1281 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int prdct = 1;
        int sum = 0;

        while (n!=0){
            prdct *= n%10;
            sum += n%10;
            n /= 10;
        }

        int result = prdct - sum;
        System.out.println(result);
        in.close();
    }
}

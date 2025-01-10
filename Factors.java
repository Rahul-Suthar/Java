import java.util.*;

public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != n/i){
                    System.out.println(n/i + " ");
                }
            }
        }
        in.close();
    }
}

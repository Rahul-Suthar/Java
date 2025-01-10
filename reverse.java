import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int rvrs = 0;

        while (n>0){
            rvrs = rvrs*10 + n%10;
            n /= 10;
        }

        System.out.println(rvrs);
        in.close();
    }
}

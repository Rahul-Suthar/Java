import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter term : ");
        int n = in.nextInt();

        int a = 0;
        int b = 1;

        // if (n==0){
        //     System.out.println(a);
        // }
        // else if (n==1){
        //     System.out.println(b);
        // }
        // else{
        //     while (n>1){
        //         next = a + b;
        //         a = b;
        //         b = next;
        //         n--;
        //     }
        //     System.out.println(next);
        // }

        for (int i=1; i<=n;i++){
            int temp = b;
            b = a + b;
            a = temp;
        }
        System.out.println(a);

        in.close();
    }
}

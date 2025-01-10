import java.util.Scanner ;

public class Prime {

    public static boolean prime(int n) {
        boolean isprime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isprime = false;
                break ;
            }
        }
        return isprime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter range : ");
        int n  = sc.nextInt();

        for(int i=2; i<=n; i++){
            if(prime(i)){
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}

import java.util.Scanner;

public class PrimeCheck {

    static boolean prime(int n) {

        boolean isprime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isprime = false;
            }
        }
        return isprime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. : ");
        int n = sc.nextInt();

        if (prime(n)) {
            System.out.println(n + " : is a prime number");
        } else {
            System.out.println(n + " : not a prime number");
        }

        sc.close();
    }
}

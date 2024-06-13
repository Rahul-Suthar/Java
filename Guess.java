

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = (int) (Math.random() * 100);
        int y;

        System.out.println("Guess a number(1-100) : ");
        
        do {
            y = sc.nextInt();

            if (y == n) {
                System.out.println("Congratulations! You guessed the number");
                break;
            }
            else if (y > n){
                System.out.println("its higher than that");
            }
            else {
                System.out.println("its lower than that");
            }
        } while (y >= 0);

        System.out.println("the number is " + n);
        sc.close();
    }
}

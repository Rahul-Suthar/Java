import java.util.*;

public class PythagorianTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        a *= a; b *= b; c *= c;

        boolean ispyth = false;
        if ( a+b==c || a+c==b || b+c==a ){
            ispyth = true;
        }

        System.out.println(ispyth ? "This is a pythagorian Triplet" : "This isn't a pythagorian Triplet");
        in.close();
    }
}

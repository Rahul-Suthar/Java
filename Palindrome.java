import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        boolean ispalindrome = true;
        for (int i=0; i < str.length() / 2; i++){
            if (str.charAt(i) != str.charAt(str.length()-1-i)){
                ispalindrome = false;
                break;
            }
        }
        String res = ispalindrome ? "Is palindrome" : "Not a palindrome";
        System.out.println(res);

        in.close();
    }
}

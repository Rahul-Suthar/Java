import java.util.*;

public class Occurance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = in.nextInt();
        System.out.print("num occur : ");
        int n = in.nextInt();

        int count = 0;

        while (num>0){
            int temp = num%10;
            if(temp == n){
                count++;
            }
            num = num/10;
        }

        String result = (count==0) ? "Number not found" : "Number Occured " + count + " times";
        System.out.println(result);
        in.close();
    }
}

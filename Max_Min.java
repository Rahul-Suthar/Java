import java.util.*;

public class Max_Min {

    public static int max(int a, int b, int c){
        int m = a;
        if (m<b) m=b;
        if (m<c) m=c;

        return m;
    }

    public static int min(int a, int b, int c){
        int m = a;
        if (m>b) m=b;
        if (m>c) m=c;

        return m;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println(min(a,b,c) + " and " + max(a,b,c));
        in.close();
    }
}
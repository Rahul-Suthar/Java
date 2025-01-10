import java.util.*;

public class Hcf_Lcm {

    public static int hcf(int n, int m){
        if(m==0){
            return n;
        }
        return hcf(m,n%m);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        // int a = n;
        // int b = m;
        // while (b!=0){
        //     int temp = b;
        //     b = a % b;
        //     a = temp;
        // }
        
        // int Hcf = a;
        int Hcf = hcf(n,m);
        int Lcm = n*m / Hcf;

        System.out.println("HCF and LCM for " + n + " and " + m + " is : " + Hcf + " and " + Lcm);
        in.close();
    }
}

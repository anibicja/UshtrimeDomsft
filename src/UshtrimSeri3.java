import java.util.Scanner;

public class UshtrimSeri3 {

    /* 1+1/2 +1/3 + 1/4    */


    public static double shumaThysave(int n) {
        double s = 0;
        for (int i = 1; i <= n; i++) {
            s+=(1.0f/i);
            if (i < n) {
                System.out.print("1/" + i + " + ");
            } else {
                System.out.print(" 1/"+ n + " = ");
            }

        }
        System.out.println();
        System.out.println("shuma eshte");
        System.out.println(s);

        return s;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni numrin e kufizave qe doni te llogariten :");
        int n = sc.nextInt();
        shumaThysave(n);

    }
}

import java.util.Scanner;

public class ushtrimSeriThysa5 {
    public static double shumaThysa(int n) {
        double s = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                s += (1.0f / i);
            } else {
                s -= (1.0f / i);
            }

            if (i < n && i % 2 == 0) {
                System.out.print("1/" + i + "- ");
            } else if  (i < n ) {
                System.out.print("1/" + i + " + ");
            } else {
                System.out.println("1/"+ n + " = ");
            }
        }
        System.out.println(s);
        return s;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni numrin e kufizave qe doni te llogariten :");
        int n = sc.nextInt();
        shumaThysa(n);
    }

}






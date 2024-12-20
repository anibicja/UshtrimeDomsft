import java.util.Scanner;

public class UshtrimSeriProdhim2 {

    /*  1*2*4*8*16       */

    public static int prodhim(int n) {
        int s =1;
        int prodTotal=1;
        System.out.print(1 + "*");
        for (int i = 1; i <= n; i++) {
            s = s * 2;
           prodTotal=prodTotal*s;
            if (i < n) {
                System.out.print(s + "*");
            } else {
                System.out.print(s  + "=");
            }
        }
        System.out.print(prodTotal);

        return s;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni nurmin e kufizave :");
        int n = sc.nextInt();
        prodhim(n);


    }
}

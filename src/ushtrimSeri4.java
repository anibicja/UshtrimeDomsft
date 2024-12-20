import java.util.Scanner;

public class ushtrimSeri4 {
    /*     1-2+3-4+5-6  */

    public static int shuma (int n){
        int s=0;
        for (int i = 1; i <= n; i++) {
            if (i%2==0){
                s-=i;
            }else{
                s+=i;
            }
            if(i<n&&i%2==0) {
                System.out.print(i + " + ");}
            else if(i<n) {
                System.out.print( i + " - ");

            }else{
                System.out.print( i + " = ");
            }




        }
        System.out.println(s);

     return s;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni numrin e kufizave qe doni te llogariten :");
        int n = sc.nextInt();
        shuma(n);

    }
}

import java.util.Scanner;

public class ushtrimSeri1 {

    /*            1+4+9+16+25+...         */
    public static void shuma(int n){
        int s = 0;
        for (int i = 1; i <= n ; i++) {
            s=s+(i*i);
            if(i<n){
                System.out.print((i*i) + " + ");
            }else {
                System.out.print(i*i+ " = ");

            }


        }
        System.out.print(s);

    }






    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni numrin e kutizave :");
        int n = sc.nextInt();
        shuma(n);

    }

}

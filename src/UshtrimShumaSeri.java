import java.util.Scanner;

public class UshtrimShumaSeri {
    public static int ShumaSeri(int n){

        /*1+4+9+16+25 */

        int s = 0;
        for (int i = 1; i <=n; i++) {
            s = s+(2*i)-1;
            if(i<n) {
                System.out.print(2 * i - 1 + " + ");}
            else{
                    System.out.print( 2*i -1 + " = ");

                }
            }
        System.out.print(s);
        return s;

        }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Deri ne sa vlera do te llogaritet shuma :");
        int a = sc.nextInt();
        ShumaSeri(a);
    }
}

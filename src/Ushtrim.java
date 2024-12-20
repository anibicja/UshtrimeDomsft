import java.util.Scanner;

public class Ushtrim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni madhesin  e vektorit");
        int n = sc.nextInt();

        int v[] = new int[n];

        System.out.println("Vendosni vlerat e vektorit");
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        int max = v[0];
        for (int i = 1; i < n; i++) {
            if (v[i] > max) {
                max = v[i];
            }
        }
        System.out.println("Maximumi i vlerave te vektorit eshte " +max);
        int shuma = 0;
        for(int i=0;i<n;i++){
            shuma= shuma+v[i];

        }
        System.out.println("shuma e te gjithe nr te vektorit eshte : "+ shuma);

    }


}
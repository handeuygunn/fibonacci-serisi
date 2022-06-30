import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("eleman sayisini giriniz:");
        int n = input.nextInt();
        int n1= 0, n2= 1, n3= 0;

        System.out.print(n3+" ");
        for ( int i = 1; i<= (n-2); i++){
            n3 = n1 + n2;
            n2= n1;
            n1=n3;

            System.out.print(n3 + " ");
        }

    }
}

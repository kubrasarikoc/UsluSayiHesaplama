import java.util.Scanner;

public class ÜslüSayi {
    public static void main(String[] args) {
        int n, k, total=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Üssü alınacak sayı : ");
        n = input.nextInt();
        System.out.println("Üs olacak sayı : ");
        k = input.nextInt();

        for (int a=1; a<=k; a++){
            total*=n;
        }
        System.out.println(total);

    }
}

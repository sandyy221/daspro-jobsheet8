import java.util.Scanner;
public class Square27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai N = ");
        int N = sc.nextInt();

        for (int i=1; i<=N; i++) {
            System.out.print("*");
        for (int j = 1; j<=N; j++) {
            System.out.print("*");
        }
        System.out.println();
        }
    }
}

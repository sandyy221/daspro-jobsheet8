import java.util.Scanner;

public class tugas27_inputN5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan nilai N = ");
        int N = sc.nextInt();

        for (int j = 1; j <= 5; j++) {
            System.out.print(N);
        }
        System.out.println();

        for (int i = 1; i <= 3; i++) {
            System.out.print(N); 
            for (int j = 1; j < 4; j++) {
                System.out.print(" ");
            }
            System.out.print(N);
            System.out.println();
        }

        for (int j = 1; j <= 5; j++) {
            System.out.print(N);
        }
        System.out.println();
    }
}
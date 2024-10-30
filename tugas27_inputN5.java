import java.util.Scanner;
public class tugas27_inputN5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Masukan nilai N = ");
        int N = sc.nextInt();
            for (int i = 1; i <= 5; i++) {
                System.out.print(N);
            }
            System.out.println();
    
            System.out.print(N);
            for (int i = 1; i < 4; i++) {
                System.out.print(" ");
            }
            System.out.print(N);
            System.out.println();
    
            for (int i = 1; i <= 5; i++) {
                System.out.print(N);
            }
          System.out.println();

  }
}

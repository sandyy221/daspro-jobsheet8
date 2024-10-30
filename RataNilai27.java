import java.util.Scanner;
public class RataNilai27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int nilaiMhs = 0;
        int rataNilai;

        for ( int j=1; j<=5; i++) {
             int totalNilai = 0;
            for (j=1; j<=5; j++) {
                System.out.println("Masukan nilai mahasiswa ke " + i);
                totalNilai+=nilaiMhs;
                
            i = 1;
            while (i<=5) {
                totalNilai = 0;
                for (j=1; j<=5; j++) {
                    System.out.print("Nilai ke-" + j + " = ");
                    nilaiMhs=sc.nextInt();
                    totalNilai+=nilaiMhs;
                 }
                rataNilai = totalNilai/5;
                i++;
                System.out.println("Rata rata mahasiswa ke " + i + " adalah " + rataNilai);

             }
            }

        }
    }
}

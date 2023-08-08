import java.util.Scanner;

public class MenghitungPajakTahunan {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan jumlah penghasilan: ");
            double penghasilan = scanner.nextDouble();
            double pajak = 0.0;
            if (penghasilan <= 50000000) {
                pajak = 0.0; 
            } else {
                pajak = penghasilan * 0.05;
            }
            
            System.out.println("Jumlah pajak yang harus dibayarkan: " + pajak);
        }
    }
}

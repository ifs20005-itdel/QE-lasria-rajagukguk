import java.util.Scanner;

public class Sampel3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      
        System.out.print("Masukkan harga beli: ");
        double hargaBeli = input.nextDouble();
        System.out.print("Masukkan harga jual: ");
        double hargaJual = input.nextDouble();

        double keuntungan = hargaJual - hargaBeli;

        if (keuntungan > 0) {
            System.out.println("Anda mendapatkan keuntungan sebesar: " + keuntungan);
        } else if (keuntungan < 0) {
            System.out.println("Anda mengalami kerugian sebesar: " + Math.abs(keuntungan));
        } else {
            System.out.println("1200 sama saja.");
        }
    }
}


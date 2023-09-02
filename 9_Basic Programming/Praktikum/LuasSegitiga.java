import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang alas segitiga: ");
        double alas = input.nextDouble();
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = input.nextDouble();
        double luasSegitiga = 0.5 * alas * tinggi;
        System.out.println("Luas segitiga adalah: " + luasSegitiga);
    }
}

import java.util.Scanner;

public class LuasPersegiPanjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      
        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = input.nextDouble();
        double luasPersegiPanjang = panjang * lebar;
        System.out.println("Luas persegi panjang adalah: " + luasPersegiPanjang);
    }
}


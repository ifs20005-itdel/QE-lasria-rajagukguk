public class Calculator {
    // Fungsi penjumlahan
    public static int add(int a, int b) {
        return a + b;
    }

    // Fungsi pengurangan
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Fungsi perkalian
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Fungsi pembagian
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Tidak bisa dibagi dengan 0");
            return Double.NaN; // Nilai Not-a-Number (NaN) untuk menunjukkan hasil yang tidak valid
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        // Input angka
        int angka1 = 3;
        int angka2 = 4;

        // Menggunakan fungsi-fungsi kalkulator
        int hasilPenjumlahan = add(angka1, angka2);
        int hasilPengurangan = subtract(angka1, angka2);
        int hasilPerkalian = multiply(angka1, angka2);
        double hasilPembagian = divide(angka1, angka2);

        // Menampilkan hasil
        System.out.println("Penjumlahan: " + hasilPenjumlahan);
        System.out.println("Pengurangan: " + hasilPengurangan);
        System.out.println("Perkalian: " + hasilPerkalian);
        System.out.println("Pembagian: " + hasilPembagian);
    }
}

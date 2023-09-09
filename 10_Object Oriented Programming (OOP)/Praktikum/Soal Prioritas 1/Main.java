
public class Main {
    public static void main(String[] args) {
        // Membuat objek-objek produk
        Product produk1 = new Product("coffee", "this is coffee", 15000, 10);
        Product produk2 = new Product("milk", "this is fresh milk", 25000, 10);
        Product produk3 = new Product("apple juice", "this is juice", 18000, 20);

        // Menampilkan informasi produk
        produk1.getInfo();
        produk2.getInfo();
        produk3.getInfo();
    }
}
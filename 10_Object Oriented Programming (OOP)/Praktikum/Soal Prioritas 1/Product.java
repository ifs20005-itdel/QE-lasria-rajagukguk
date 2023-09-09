class Product {
    private String nama;
    private String deskripsi;
    private int harga;
    private int jumlahStok;

    // Constructor
    public Product(String nama, String deskripsi, int harga, int jumlahStok) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.jumlahStok = jumlahStok;
    }

    // Setter dan Getter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    // Setter dan Getter untuk deskripsi
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getDeskripsi() {
        return this.deskripsi;
    }

    // Setter dan Getter untuk harga
    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return this.harga;
    }

    // Setter dan Getter untuk jumlah stok
    public void setJumlahStok(int jumlahStok) {
        this.jumlahStok = jumlahStok;
    }

    public int getJumlahStok() {
        return this.jumlahStok;
    }

    // Method getInfo() untuk menampilkan informasi produk
    public void getInfo() {
        System.out.println("INFO PRODUK");
        System.out.println("nama: " + this.nama);
        System.out.println("deskripsi: " + this.deskripsi);
        System.out.println("harga: " + this.harga);
        System.out.println("jumlah stok: " + this.jumlahStok);
        System.out.println("===");
    }
}

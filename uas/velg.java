public class velg {
    private String kodevelg;
    private String nama;
    private String kategori;
    private double harga;

    // Method Constructor
    public void velg() {
        System.out.println("ini show velg");
    }

    // Getter for kodevelg, nama, kategori, harga
    public int getkodevelg() {
        return this.kodevelg;
    }

    public String getNama() {
        return this.nama;
    }

    public String getKategori() {
        return this.kategori;
    }

    public double getHarga() {
        return this.harga;
    }

    // Setter for id, nama, kategori, harga
    public void setkodevelg(String kodevelg) {
        this.kodevelg = kodevelg;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Method ubah kategori
    public void ubahkategori() {
        System.out.println("ini velg rally");
    }

    // overloading
    public void ubahkategori(String kategori) {
        System.out.println("ini velg rally");
    }

}
//Latihan 5 Buat subclass Komik dari superclass Buku, tambahkan atribut volume, dan method getVolume
public class komik extends Buku {
    private int volume;

    public int getVolume(){
        return this.volume;
    }

    //Latihan 7 Buat subclass Komik dari superclass Buku, buat overriding dari method naikkanHarga()
    public void naikkanHarga(){
        System.out.println("HArga komik Teleh dinaikkan");
    }
}

//Larihan 8
public class komik extends Produk {
    private String nama;

    public String getNama(){
        return this.nama;
    }
    public void naikkanHarga(){
        System.out.println("Harga Produk telah dinaikkan");
    }
}
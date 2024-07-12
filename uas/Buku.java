//Latihan 3
public class Buku {
    private int id;
    private String judul;
    private String penulis;
    private int jumlahHalaman;
    private double harga;

    //method constructor
    public Buku(){
        System.out.println("Object Buku telah diciptakan, constructor nerjalan");
    }
    
    //Getter for id, judul, penulis, jumlah_halaman, harga
    public int getId(){
        return this.id;
    }

    public int getJudul(){
        return this.judul;
    }

    public int getPenulis(){
        return this.penulis;
    }

    public int getjumlahHalaman(){
        return this.jumlahHalaman;
    }
 
    public double getHarga(){
        return this.harga;
    }

    //Setter for id, judul, penulis, jumlah_halaman, harga
    public void setId(int id){
        this.id = id;
    }

    public void setJudul(String judul){
        this.judul = judul;
    }

    public void setPenulis(String penulis){
        this.penulis = penulis;
    }

    public void setjumlahHalaman(int jumlahHalaman){
        this.jumlahHalaman = jumlahHalaman;
    }

    public void setHarga(double harga){
        this.harga = harga;
    }

    //Latihan 6 Pada class Buku, buat method naikkanHarga() dan overloadingnya naikkanHarga(double kenaikan)
    public void naikkanHarga(){
        System.out.println("Harga telah dinaikkan");
    }
    //overloading
    public void naikkanHarga(double kenaikan){
        System.out.println("Harga telah dinaikkan");
    }
}

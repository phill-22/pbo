import javax.print.DocFlavor.STRING;

public class Data {

    String Nama_buku;
    String Jenis_buku;
    String Kd_buku;
    int jumlah_buku;

    void Tampilkan_data() {
        System.out.println("judul buku : " + Nama_buku);
        System.out.println("kategti buku : " + Jenis_buku);
        System.out.println("kode buku : " + Kd_buku);
        System.out.println("jumalh buku : " + jumlah_buku);
    }

    void create() {
        System.out.println("SELECT * FROM data");

    }

    void hapus(int id) {
        System.out.println("DELETE FROM data WHERE id = " + id);

    }

    void create(String Nama_buku, String Jenis_buku, String Kd_buku, int jumlah_buku) {
        String insertsql = "INSERT INTO data VALUES(";
        insertsql += "'" + this.Nama_buku + "',";
        insertsql += "'" + this.Jenis_buku + "',";
        insertsql += "'" + this.Kd_buku + "',";
        insertsql += this.jumlah_buku + ")";

    }

}
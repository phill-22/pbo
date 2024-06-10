import java.util.Scanner;

public class toko_buku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Data buku = new Data();

        System.out.println("masukkan judul buku :");
        String judul = buku.Jenis_buku;

        buku.Nama_buku = "1001 cara untuk memahami bumi itu datar";
        buku.Jenis_buku = "fiksi";
        buku.Kd_buku = "Kd_001";
        buku.jumlah_buku = 3;

        buku.Tampilkan_data();

    }

}

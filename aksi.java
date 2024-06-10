
class Mahasiswa {
    String nama = "nama saya";

    Mahasiswa(String nama) {
        System.out.println(nama);
        System.out.println(this.nama);
    }
}

public class aksi {
    public static void main(String[] args) {

        Mahasiswa data = new Mahasiswa("adi");
        data.nama = "fajar";
        System.out.println(data.nama);

    }

}

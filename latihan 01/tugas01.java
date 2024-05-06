import java.util.Scanner;

public class tugas01 {
    public static void main(String[] args) {
        Scanner toko = new Scanner(System.in);
        String[] buah = { "APEL", "SEMANGKAT", "JERUK" };
        int[] harga = { 30000, 25000, 15000 };

        System.out.println("selamat datang di toko buah kami");

        System.out.println("pilihan buah [apel , semangka , jeruk , ]");
        System.out.println("masukkan nomor buah 1 - 3 :");
        int nama = toko.nextInt();

        System.out.println("masukkan berat buah : ");
        int kg = toko.nextInt();

        switch (nama) {
            case 1:
                System.out.println("nama buah : " + buah[0]);
                break;
            case 2:
                System.out.println("nama buah : " + buah[1]);
            case 3:
                System.out.println("nama buah : " + buah[2]);

            default:
                System.out.println("input nama buah salah, masukkan data dengan benar");
                break;
        }

        if (nama == 1) {
            int total = harga[0] * kg;

            System.out.println("total belanjaan :" + total);
        } else if (nama == 2) {
            int total = harga[1] * kg;

            System.out.println("total belanjaan :" + total);

        } else if (nama == 3) {
            int total = harga[2] * kg;

            System.out.println("total belanjaan :" + total);
        } else {
            System.out.println("data tidak sesuai silahkan coba lagi");
        }

    }
}

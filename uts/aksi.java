package uts;

import java.util.Scanner;

public class aksi {
    public static void main(String[] args) {
        mobil mobilbaru = new mobil();
        mobil balap = new mobil();
        mobil rusak = new mobil();
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Nama Mobil");
        mobilbaru.nama_mobil = input.nextLine();

        System.out.println("masukkan merek mobil");
        mobilbaru.merek_mobil = input.nextLine();

        System.out.println("masukkan tipe mobil");
        mobilbaru.tipe_mobil = input.nextLine();

        System.out.println("masukkan tipe mesin");
        mobilbaru.tipe_mesin = input.nextLine();

        System.out.println("masukkan pajak mobil hidup & mati");
        mobilbaru.pajak_mobil = input.nextLine();

        System.out.println("mmasukkan harga mobil : ");
        mobilbaru.harga_mobil = input.nextInt();

        System.out.println(mobilbaru);

        mobilbaru.output_mobil();
        mobilbaru.plat_mobil();
        mobilbaru.bayar_bayar();
        mobilbaru.pintu_mobil();
        mobilbaru.tipe_mobil();

        balap.tipe_mobil = "rally";
        balap.tampil();

    }

}

package uas01;

import java.util.Scanner;

public class kendaraan {
    String id;
    String bahan_bakar;
    String kecepatan;
    String kapasitas_penumpang;
    String sql;

    public static void main(String[] args) {
        kendaraan baru = new kendaraan();
        Scanner input = new Scanner(System.in);

        System.out.println("MASUKKAN id : ");
        baru.id = input.nextLine();
        System.out.println("masukkan bahanbakar : ");
        baru.bahan_bakar = input.nextLine();
        System.out.println("masukkan kecepatan : ");
        baru.kecepatan = input.nextLine();
        System.out.println("masukkan kapasistas penumpang : ");
        baru.kapasitas_penumpang = input.nextLine();

        System.out.println("id = " + baru.id);
        System.out.println("bahanbakar = " + baru.bahan_bakar);
        System.out.println("kecepatan = " + baru.kecepatan);
        System.out.println("masukkan kapasistas penumpang : " + baru.kapasitas_penumpang);

    }

    public void create() {
    }

    public void read() {

        sql = " echo'SELECT * FROM kendaraan'";

    }

    public void read(String id) {

        sql = " echo'SELECT * FROM kendaraan where id'";

    }

    public void update() {
    }

    public void delete() {
    }

}

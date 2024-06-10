package uts;

public class mobil {
    String nama_mobil;
    String merek_mobil;
    String tipe_mobil;
    String tipe_mesin;
    String bahan_bakar;
    String power_mesin;
    String pajak_mobil;
    int harga_mobil;
    int pajak;
    int harga_pajak_mobil;
    int pintu_mobil;
    String plat_mobil;

    void output_mobil() {
        System.out.println("Nama mobil: " + nama_mobil);
        System.out.println("merek mobil: " + merek_mobil);
        System.out.println("tipe mobil: " + tipe_mobil);
        System.out.println("pajak mobil: " + pajak_mobil);
        System.out.println("harga mobil: " + harga_mobil);

    }

    void plat_mobil() {
        if (pajak_mobil.equals("hidup")) {
            plat_mobil = "putih";
            System.out.println("plat mobil = " + plat_mobil);
        } else {
            plat_mobil = "hitam";
            System.out.println("plat mobil = " + plat_mobil);
        }

    }

    void bayar_bayar() {
        if (harga_mobil >= 2000 && pajak_mobil.equals("mati")) {
            pajak = 6000000;
            System.out.println("total pajak = " + pajak);

        } else {
            System.out.println("sudah bayar pajak");
        }
    }

    void pintu_mobil() {
        if (tipe_mobil.equals("mpv") || tipe_mobil.equals("apv")) {
            pintu_mobil = 2;
            System.out.println("jumlah pintu mobil = " + pintu_mobil);

        } else {
            System.out.println("jumlah pintu tidak di ketahui");
        }
    }

    void tipe_mobil() {
        if (tipe_mesin.equals("v12") || tipe_mesin.equals("v8") || tipe_mesin.equals("2jz")) {
            bahan_bakar = "bensin";
            power_mesin = "250 - 650 whp";
            System.out.println("bahan bakar " + bahan_bakar);
            System.out.println("power mesin " + power_mesin);
        }
    }

    void tampil() {
        System.out.println("tipe mobil" + tipe_mobil);
    }

}

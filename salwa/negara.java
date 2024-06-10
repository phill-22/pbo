package salwa;

public class negara {
    String nama;
    String benua;
    String warnabendera;
    String wilayah;
    String pemimpin;

    void printnegara() {
        System.out.println("Nama Negara : " + nama);
        System.out.println("Benua : " + benua);
        System.out.println("Warna Bendera : " + warnabendera);
        System.out.println("Wilayah : " + wilayah);
        System.out.println("Pemimpin : " + pemimpin);
    }

    void read() {
        System.out.println("SELECT * FROM negara");
    }

}

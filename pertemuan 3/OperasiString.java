
public class OperasiString {

    public static void main(String[] args) {
        String kota = "banjarbaru";
        System.out.println(kota);

        char[] Uniskachar = { 'C', 'I', 'M', 'A', 'H' };
        String UniskaString = new String(Uniskachar);
        System.out.println(UniskaString);
        System.out.println(UniskaString.toLowerCase());

        System.out.println(kota.toUpperCase());
        System.out.println(kota.toLowerCase());
        System.out.println(kota.substring(6));

        System.out.println(UniskaString.substring(0, 4));
        System.out.println(kota.substring(0, 6));

        String Hri = "2024-02-22";
        String tahun = Hri.substring(0, 4);
        String bulan = Hri.substring(5, 7);
        String hari = Hri.substring(8, 10);
        System.out.println(hari + "-" + bulan + "-" + tahun);
    }
}
package coba;

public class coba {
    int x = 5;
    int y = 20;
    int z = 50;
    int baru = x * y * z;

    public static void main(String[] args) {
        coba ini1 = new coba(); // Object 1
        coba ini2 = new coba(); // Object 2
        System.out.println(ini1.x);
        System.out.println(ini2.baru);
    }
}
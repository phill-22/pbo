
public class Operator {
    public static void main(String[] args) {

        int jumlahsks = 144;
        double ipk = 1.89;
        String username = "admin";
        String password = "cimah";
        System.out.println(1 + 2);
        System.out.println(1 - 2);
        System.out.println(1 * 2);
        System.out.println(1 / 2);
        System.out.println(1 % 2);

        // unary
        System.out.println(jumlahsks++);
        System.out.println(++jumlahsks);

        String Ket = ipk > 3.5 ? "dengan pujian" : "B aja";
        System.err.println(Ket);

        String usernameInputan = "admin";
        String passwordInputan = "admin";
        if (usernameInputan.equals(username)) {
            if (passwordInputan.equals(password)) {
                System.out.println("bersalah");
            } else {
                System.out.println("password Salah");
            }
        } else {
            System.out.println("username salah");
        }

    }
}

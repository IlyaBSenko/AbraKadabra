public class Abra {

    public static void main(String[] args) {
        String abraKadabra = "ABRAKADABRA";
        abr(abraKadabra);

    }

    public static void abr(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        System.out.println(str.charAt(0));
        abr(str.substring(1));
    }
}


public class Abra {

    public static void main(String[] args) {
        String abraKadabra = "ABRAKADABRA";
        int charsToPrint = 1;
        abr(abraKadabra, charsToPrint);

    }

    public static void abr(String str, int charsToPrint) {
        if (charsToPrint > str.length()) {
            return;
        }
        System.out.println(str.substring(0, charsToPrint));
        abr(str, charsToPrint + 1);
    }
}


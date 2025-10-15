public class Abra {

    public static void main(String[] args) {
        String abraKadabra = "ABRAKADABRA";
        int charsToPrint = 1;
        int spaces = abraKadabra.length(); 
        abr(abraKadabra, charsToPrint, spaces);

    }

    public static void abr(String str, int charsToPrint, int spaces) {
        if (charsToPrint > str.length()) {
            return;
        }
        String empty = " ";
        System.out.println(empty.repeat(spaces) + str.substring(0, charsToPrint) + empty.repeat(spaces));
        abr(str, charsToPrint + 1, spaces - 1);
    }
}


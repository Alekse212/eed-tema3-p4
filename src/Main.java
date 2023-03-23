public class Main {
    public static void main(String[] args) {
        Main programa = new Main();

        boolean resultado = programa.esPalindromo("otto");
    }

    public boolean esPalindromo(String texto) {
        if (texto.length() > 4) {

            texto = texto.toLowerCase().replaceAll("[^a-z0-9]", "");
            String reversedStr = new StringBuilder(texto).reverse().toString();
            return texto.equals(reversedStr);
        } else {
            return false;
        }
    }
}

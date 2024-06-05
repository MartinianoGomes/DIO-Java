public class NomeCompleto {
    public static void main(String[] args) {
        System.out.println("Programa | Primeiro e segundo nome.");

        String primeiroNome = "Martiniano";
        String segundoNome = "Gomes";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
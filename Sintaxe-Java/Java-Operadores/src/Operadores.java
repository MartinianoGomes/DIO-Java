public class Operadores {
    public static void main(String[] args) throws Exception {
        int a, b;

        a = 5;
        b = 6;

        String resultado = "";

        // 1º maneira de fazer um IF/ELSE
        if (a == b) {
            resultado = "verdadeiro";
        } else {
            resultado = "falso";
        }

        // 2º maneira de fazer um IF/ELSE
        String resultado2 = "";

        if (a == b) 
            resultado2 = "verdadeiro";
        else 
            resultado2 = "falso";
        
        System.out.println(resultado2);

        // 3º maneira de fazer um IF/ELSE (Ternário)
        String resultado3 = a == b ? "verdadeiro" : "falso";

        System.out.println(resultado3);
    }
}

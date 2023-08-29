package edu.juliana.sintaxe;
public class MinhaClasse {

    // método principal
    public static void main(String[] args) { 
        System.out.print("Olá, mundo!\n"); // imprimindo
        String primeiroNome = "Juliana"; // declarando variável
        String segundoNome = "Girotto"; // declarando variável

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome); // declarando variável com valor de método

        System.out.println(nomeCompleto); // imprimindo a variável
    }

    // declarando o método do nome completo
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}

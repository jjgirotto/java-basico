package edu.juliana.sintaxe;

public class OperadorRelacional {
    public static void main(String[] args) {
        //comparando strings
        String nome1 = "Juliana";
        String nome2 = "Juliana";
        System.out.println(nome1 == nome2); //true  
        
        //comparando strings com objetos
        String nome3 = "Juliana";
        String nome4 = new String("Juliana");
        System.out.println(nome3 == nome4); // false

        //para comparar conteúdos usar equals
        System.out.println(nome3.equals(nome4)); // true
        
        //comparando números
        int numero1 = 1;
        int numero2 = 2;
        // se um é menor que outro
        if(numero1 < numero2) {
            System.out.println("condição verdadeira");
        }
        // se um é igual a outro
        boolean simNao = numero1 == numero2;
        System.out.println("número um é igual ao número dois? " + simNao);
        // se um é diferente do outro
        simNao = numero1 != numero2;
        System.out.println("número um é diferente do número dois? " + simNao);
        // se um é maior que outro
        simNao = numero1 > numero2;
        System.out.println("número um é maior do que número dois? " + simNao);
    }
}

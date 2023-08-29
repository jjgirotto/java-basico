package edu.juliana.sintaxe;

public class OperadoresAdicao {

    public static void main(String[] args) {
    String concatenacao = "?";
    concatenacao = 1+1+1+"1";
    System.out.print(concatenacao); // somou até 3 e juntou com 1 = 31
    concatenacao = 1+"1"+1+1;
    System.out.print(concatenacao); // juntou 1 com 1 e o resto ele concatena = 1111
    concatenacao = 1+"1"+1+"1";
    System.out.print(concatenacao); // juntou 1 com 1 e o resto ele concatena = 1111
    concatenacao = "1"+(1+1+1);
    System.out.print(concatenacao); // executa o () e junta com o 1 = 13
    concatenacao = "1"+(1+"1"+1);
    System.out.print(concatenacao);
    }
}
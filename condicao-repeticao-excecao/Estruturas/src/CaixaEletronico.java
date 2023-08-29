public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 26.0;

        if(valorSolicitado < saldo) //se valor for menor, saldo terá o valor diminuído, senão continua o valor inicial
            saldo = saldo - valorSolicitado;

        System.out.println("Saldo final = R$" + saldo);
    }
}

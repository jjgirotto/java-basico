public class Autodromo {
    public static void main(String[] args) {
        Carro ferrari = new Carro();
        ferrari.setChassi("0868");
        ferrari.ligar();

        Moto xre = new Moto();
        xre.setChassi("7656");
        xre.ligar();

        Veiculo coringa = xre;
        coringa.ligar();
    }
}

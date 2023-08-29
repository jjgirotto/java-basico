package edu.juliana.sintaxe;

public class SmartTv {
        boolean ligada = false;
        int canal = 1;
        int volume = 25;

    //método para ligar e desligar sem retorno
        public void ligar() {
            ligada = true;
        }
        public void desligar() {
            ligada = false;
        }
    // aumentar e diminuir o volume da tv
        public void aumentarVolume() {
            volume++;
            System.out.println("Aumentando o volume para " + volume);
        }
        public void diminuirVolume() {
            volume--;
            System.out.println("Diminuindo o volume para " + volume);
        }
    //trocar de canal
        public void aumentarCanal() {
            canal++;
        }
        public void diminuirCanal() {
            canal--;
        }
        public void mudarCanal(int novoCanal) {
            canal = novoCanal;
        }
}

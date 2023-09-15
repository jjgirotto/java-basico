import java.util.Arrays;
import java.util.List;

public class Desafio18 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Verifique se todos os números da lista são iguais e apresente os que se repetem
        boolean numerosSaoIguais = numeros.stream()
            .distinct()
            .count() == numeros.size();
        System.out.println(numerosSaoIguais);
    }
}

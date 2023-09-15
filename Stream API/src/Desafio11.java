import java.util.Arrays;
import java.util.List;

public class Desafio11 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Encontre a soma dos quadrados de todos os números da lista:
        int somaQuadrados = numeros.stream()
            .map(n -> n * n)
            .mapToInt(Integer::intValue)
            .sum();
        System.out.println(somaQuadrados);
    }
}

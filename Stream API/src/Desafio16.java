import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Desafio16 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Agrupe os números em pares e ímpares:
        Predicate<Integer> pares = n -> n % 2 == 0;
        Predicate<Integer> impares = n -> n % 2 != 0;
        List<Integer> numerosPares = numeros.stream()
            .filter(pares)
            .collect(Collectors.toList());
        List<Integer> numerosImpares = numeros.stream()
            .filter(impares)
            .collect(Collectors.toList());
        System.out.println("pares: " + numerosPares);
        System.out.println("ímpares: " + numerosImpares);
    }
}

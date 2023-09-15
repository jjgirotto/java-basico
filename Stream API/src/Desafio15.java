import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio15 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Verifique se a lista contém pelo menos um número negativo:
        Predicate<Integer> numerosNegativos = numero -> numero < 0;
        boolean contemNegativos = numeros.stream()
            .anyMatch(numerosNegativos);

        System.out.println(contemNegativos);
    }
}

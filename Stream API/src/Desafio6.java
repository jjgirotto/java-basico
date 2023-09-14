import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio6 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11);

        //Verificar se a lista contém algum número maior que 10:
        Predicate<Integer> numerosMaior10 = numero -> numero > 10;
        numeros.stream()
            .filter(numerosMaior10)
            .forEach(System.out::println);
    }
}

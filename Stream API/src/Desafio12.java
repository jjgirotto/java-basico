import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio12 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Encontre o produto de todos os números da lista:
        Optional<Integer> somaProdutos = numeros.stream()
            .reduce((a, b) -> a * b);
        somaProdutos.ifPresent(result -> {
            System.out.println("A soma dos produtos é de " + result);
        });
    }
}

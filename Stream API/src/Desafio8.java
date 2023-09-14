import java.util.Arrays;
import java.util.List;

public class Desafio8 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11);
        
        //Somar os dígitos de todos os números da lista:
        int somaDigitos = numeros.stream()
            .flatMap(n -> String.valueOf(n).chars().mapToObj(Character::getNumericValue))
            .mapToInt(Integer::intValue)
            .sum();
        System.out.println(somaDigitos);

    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List <Numeros> numeroLista;

    public OrdenacaoNumeros() {
        this.numeroLista = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeroLista.add(new Numeros(numero));
    }

    public List<Numeros> ordenarAscendente() {
        List<Numeros> ordemAscendente = new ArrayList<Numeros>(numeroLista);
        Collections.sort(ordemAscendente);
        return ordemAscendente;
    }

    public List<Numeros> ordenarDescendente() {
        List<Numeros> ordemAscendente = ordenarAscendente();
        Collections.reverse(ordemAscendente);
        return ordemAscendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordemDeNumeros = new OrdenacaoNumeros();

        ordemDeNumeros.adicionarNumero(50);
        ordemDeNumeros.adicionarNumero(30);
        ordemDeNumeros.adicionarNumero(3);
        ordemDeNumeros.adicionarNumero(100);
        ordemDeNumeros.adicionarNumero(1);

        System.out.println(ordemDeNumeros.ordenarAscendente());
        System.out.println();
        System.out.println(ordemDeNumeros.ordenarDescendente());
    }
}
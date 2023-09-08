import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List <Pessoa> pessoalista;

    public OrdenacaoPessoas() {
        this.pessoalista = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoalista.add(new Pessoa(nome, idade, altura));
    }
    
    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoalista);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoalista);
        if (!pessoalista.isEmpty()) {
          Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
          return pessoasPorAltura;
        } else {
          throw new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoPessoas
          OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
      
          // Adicionando pessoas à lista
          ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
          ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
          ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
          ordenacaoPessoas.adicionarPessoa("David", 17, 1.58);
      
          // Ordenando e exibindo por idade
          System.out.println(ordenacaoPessoas.ordenarPorIdade());
        
            System.out.println();

          // Ordenando e exibindo por altura
          System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> carrinhodecompras;

    public CarrinhoCompras() {
        this.carrinhodecompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco,  int quantidade) {
        carrinhodecompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i : carrinhodecompras) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
            }
        }
        carrinhodecompras.removeAll(itensParaRemover);
    }

    public double calcularValorTotal() {
        double somaTotal = 0;
        for (Item i : carrinhodecompras) {
            int quantidade = i.getQuantidade();
            double preco = i.getPreco();
            double subtotal = quantidade * preco;
            somaTotal += subtotal;
        }
        System.out.println(somaTotal);
        return somaTotal;
    }

    public void exibirItens() {
        for (Item i : carrinhodecompras) {
            System.out.println("Nome: " + i.getNome());
            System.out.println("Quantidade: " + i.getQuantidade());
            System.out.println("Preço: " + i.getPreco() + "\n");
        }
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();

        carrinho.adicionarItem("feijão", 7.00, 130);
        carrinho.adicionarItem("arroz", 20.5, 50);
        carrinho.adicionarItem("bolacha", 3.00, 120);

        carrinho.removerItem("bolacha");

        carrinho.calcularValorTotal();

        carrinho.exibirItens();
    }
}
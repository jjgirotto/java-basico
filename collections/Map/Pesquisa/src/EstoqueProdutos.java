import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueMap;

    public EstoqueProdutos() {
        this.estoqueMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotal = 0; 
        if (!estoqueMap.isEmpty()) {
           for (Produto p : estoqueMap.values()) {
            valorTotal += p.getQuantidade() * p.getPreco();
           } 
        }
        else {
            System.out.println("Estoque vazio.");
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueMap.isEmpty()) {
            for (Produto p : estoqueMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        else {
            System.out.println("Estoque vazio.");
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueMap.isEmpty()) {
            for (Produto p : estoqueMap.values()) {
                if (p.getPreco() < menorPreco) {
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        else {
            System.out.println("Estoque vazio.");
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaisQuantidade = null;
        double produtoMaiorQuantidade = 0;
        if (!estoqueMap.isEmpty()) {
            for(Map.Entry<Long, Produto> entry : estoqueMap.entrySet()) {
                double valorProdutoEstoque = entry.getValue().getPreco() * entry. getValue().getQuantidade();
                if (valorProdutoEstoque > produtoMaiorQuantidade) {
                    produtoMaiorQuantidade = valorProdutoEstoque;
                    produtoMaisQuantidade = entry.getValue();
                }
            }
        }
        else {
            System.out.println("Estoque vazio.");
        }
        return produtoMaisQuantidade;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
    
        // Exibe o estoque vazio
        estoque.exibirProdutos();
    
        // Adiciona produtos ao estoque
        estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);
    
        // Exibe os produtos no estoque
        estoque.exibirProdutos();
    
        // Calcula e exibe o valor total do estoque
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
    
        // Obtém e exibe o produto mais caro
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);
    
        // Obtém e exibe o produto mais barato
        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);
    
        // Obtém e exibe o produto com a maior quantidade em valor no estoque
        Produto produtoMaisQuantidade = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaisQuantidade);

    }
}
public class Tarefa {
    // atributo
    private String nome;
    private float preco;
    private int quantidade;
    
    public Tarefa(String nome, float preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public String getNome() {
        return nome;
    }
    public float getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
/*
 *     @Override
    public String toString() {
        return descricao;
    }
 */


}

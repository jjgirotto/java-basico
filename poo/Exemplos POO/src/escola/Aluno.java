package escola;

public class Aluno {
    /* String nome;
    int idade; */
    
    // fazendo pela convenção Java Beans
    //variáveis privadas
    private String nome;
	private int idade;
    private String genero;
	//métodos getter e setter (um para cada atributo)
	public String getNome() {
		return nome;
	}
	public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setNome(String newNome) {
		nome = newNome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int newIdade) {
		this.idade = newIdade;
	}
}
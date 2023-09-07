package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        /* felipe.nome = "Felipe";
        felipe.idade = 8; */
        
        // fazendo pela convenção Java Beans, definindo novo atributo para nome e idade
        felipe.setNome("Felipe");
        felipe.setIdade(8);

        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos.");
    }
}

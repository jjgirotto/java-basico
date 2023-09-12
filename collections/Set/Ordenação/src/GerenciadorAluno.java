import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAluno {
    private Set<Aluno> alunoSet;

    public GerenciadorAluno() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media) {
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;
        if (!alunoSet.isEmpty()) {
            for (Aluno a : alunoSet) {
                if (a.getMatricula() == matricula) {
                    alunoParaRemover = a;
                    break;
                }
            }
            alunoSet.remove(alunoParaRemover);
        }
        else
            System.out.println("Lista vazia.");
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alunoPorNome = new TreeSet<>(alunoSet);
        System.out.println(alunoPorNome);
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunoPorMedia = new TreeSet<>(new ComparatorPorMedia());
        alunoPorMedia.addAll(alunoSet);
        return alunoPorMedia;
    }

    public void exibirAlunos() {
        System.out.println(alunoSet);
    }
    
    public static void main(String[] args) {
        GerenciadorAluno gerenciador = new GerenciadorAluno();

        gerenciador.exibirAlunos();

        gerenciador.adicionarAluno("Ju", 115226, 9.5);
        gerenciador.adicionarAluno("Caio", 115226, 9.0);
        gerenciador.adicionarAluno("João", 115228, 3.5);
        gerenciador.adicionarAluno("Bia", 115229, 5.5);

        gerenciador.exibirAlunos();

        gerenciador.removerAluno(115226);

        gerenciador.exibirAlunos();

        gerenciador.exibirAlunosPorNome();
        System.out.println(gerenciador.exibirAlunosPorNota());    

    }
}

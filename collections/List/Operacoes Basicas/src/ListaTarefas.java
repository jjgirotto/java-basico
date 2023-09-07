import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    // atributo
    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int numeroTotalTarefas() {
        return tarefaList.size();
    }

    public void descricaoTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listadetarefa = new ListaTarefas();

        listadetarefa.adicionarTarefa("Tarefa 1");
        listadetarefa.adicionarTarefa("Tarefa 1");
        listadetarefa.adicionarTarefa("Tarefa 2");

        //listadetarefa.removerTarefa("Tarefa 1");

        listadetarefa.descricaoTarefas();

        System.out.println("O numero total de elementos é " + listadetarefa.numeroTotalTarefas());
    }

}

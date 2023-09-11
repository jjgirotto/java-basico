public class Tarefa {
    private String descricao;
    private boolean ok;
    
    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.ok = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setConcluida(boolean ok) {
        this.ok = ok;
    }

    public boolean isOk() {
        return ok;
    }

    @Override
    public String toString() {
        return descricao + ", " + ok;
    }   
}

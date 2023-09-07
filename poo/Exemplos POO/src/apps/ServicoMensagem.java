package apps;
public abstract class ServicoMensagem {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    
    protected void validarConexao() {
        System.out.println("validando conexão");
    }
    protected void salvarHistorico() {
        System.out.println("salvando historico");
    }
}

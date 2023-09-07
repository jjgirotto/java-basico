package apps;

public class MSN extends ServicoMensagem {
    public void enviarMensagem() {
        validarConexao();
        System.out.println("enviando msg pelo msn");
        salvarHistorico();
    }
    public void receberMensagem() {
        System.out.println("recebendo msg pelo msn");
    }
}

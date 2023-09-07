package apps;

public class Facebook extends ServicoMensagem {
    public void enviarMensagem() {
        validarConexao();
        System.out.println("enviando msg pelo facebook");
        salvarHistorico();
    }
    public void receberMensagem() {
        System.out.println("recebendo msg pelo facebook");
    }
}

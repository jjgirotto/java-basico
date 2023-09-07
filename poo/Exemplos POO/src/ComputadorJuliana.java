import apps.Facebook;
import apps.MSN;
import apps.ServicoMensagem;

public class ComputadorJuliana {
    public static void main(String[] args) {
        ServicoMensagem smi = null;
		
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido="fb"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MSN();
		else if(appEscolhido.equals("fb"))
			smi = new Facebook();
		
			
		smi.enviarMensagem();
		smi.receberMensagem();
    }
}

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 5;
        //se nota for maior ou igual aprovado      
        if(nota >= 7)
            System.out.println("Aprovado");
        //se não reprovado
        
        else if (nota >= 5 && nota < 7)
            System.out.println("Prova de recuperação");
                
        else {
            System.out.println("Reprovado");
            int recuperacao = 10 - nota;
	        System.out.println("Precisa de " + recuperacao + " para passar no exame");
        }
    }
}

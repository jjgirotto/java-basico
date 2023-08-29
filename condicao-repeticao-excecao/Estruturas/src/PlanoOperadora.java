public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M"; // B / T
        /*
         * BASIC: 100 minutos de ligação;
        MÍDIA: 100 minutos de ligação + WhatsApp e Instagram grátis;
        TURBO: 100 minutos de ligação + WhatsApp e Instagram grátis + 5 GB Youtube.
         */
        switch (plano) {
	        case "T": {
		        System.out.println("5Gb Youtube");
	}
	        case "M": {
		        System.out.println("WhatsApp e Instagram grátis");
	}
	        case "B": {
		        System.out.println("100 minutos de ligação");
	}
    }
}
}

package ProjetoFofoPet;

public class CadastroFofoPetter {
	
		String fofoPetter;
	    int idade;
	    String endereço;
	    boolean paiMaeDePet;
	    int camasQuentinhas;
	    String contato;
	      
	    public void disponibilidade () {
	    	if (camasQuentinhas >= 1 );{
	    		System.out.println("Parabéns, em breve a família estará completa!!!");
	    	}
	    }
	    public void status() {
	    	System.out.println("Tudo que precisamos saber sobre o FofoPetter...\n");
	    	System.out.println("Nome: " + this.fofoPetter);
	    	System.out.println("Idade: " + this.idade);
	    	System.out.println("Endereço: " + this.endereço);
	    	System.out.println("Você tem algum pet em casa? " + this.paiMaeDePet);
	    	System.out.println("Quantas vagas você pode oferecer: " + this.camasQuentinhas);
	    	System.out.println("Contato: " + this.contato);
	    }
	}

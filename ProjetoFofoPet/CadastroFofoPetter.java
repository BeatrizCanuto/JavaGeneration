package ProjetoFofoPet;

public class CadastroFofoPetter {
	
		String fofoPetter;
	    int idade;
	    String endere�o;
	    boolean paiMaeDePet;
	    int camasQuentinhas;
	    String contato;
	      
	    public void disponibilidade () {
	    	if (camasQuentinhas >= 1 );{
	    		System.out.println("Parab�ns, em breve a fam�lia estar� completa!!!");
	    	}
	    }
	    public void status() {
	    	System.out.println("Tudo que precisamos saber sobre o FofoPetter...\n");
	    	System.out.println("Nome: " + this.fofoPetter);
	    	System.out.println("Idade: " + this.idade);
	    	System.out.println("Endere�o: " + this.endere�o);
	    	System.out.println("Voc� tem algum pet em casa? " + this.paiMaeDePet);
	    	System.out.println("Quantas vagas voc� pode oferecer: " + this.camasQuentinhas);
	    	System.out.println("Contato: " + this.contato);
	    }
	}

package ProjetoFofoPet;

public class CadastroFofoPet {
	
	String fofoPet;
    int idade;
    String endere�o;
    String porte;
    boolean aceitaOutroPet;
    
      
    public void restri��o () {
    	if (aceitaOutroPet == false);{
    		System.out.println("Esse FofoPet exige ser filho �nico!!!");
   
    	}
    }
    public void status() {
    	System.out.println("Tudo que precisamos saber sobre o FofoPet...\n");
    	System.out.println("Nome: " + this.fofoPet);
    	System.out.println("Idade: " + this.idade);
    	System.out.println("Endere�o: " + this.endere�o);
    	System.out.println("Porte: " + this.porte);
    	System.out.println("Aceita outros pets? " + this.aceitaOutroPet);
    }
}




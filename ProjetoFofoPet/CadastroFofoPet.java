package ProjetoFofoPet;

public class CadastroFofoPet {
	
	String fofoPet;
    int idade;
    String endereço;
    String porte;
    boolean aceitaOutroPet;
    
      
    public void restrição () {
    	if (aceitaOutroPet == false);{
    		System.out.println("Esse FofoPet exige ser filho único!!!");
   
    	}
    }
    public void status() {
    	System.out.println("Tudo que precisamos saber sobre o FofoPet...\n");
    	System.out.println("Nome: " + this.fofoPet);
    	System.out.println("Idade: " + this.idade);
    	System.out.println("Endereço: " + this.endereço);
    	System.out.println("Porte: " + this.porte);
    	System.out.println("Aceita outros pets? " + this.aceitaOutroPet);
    }
}




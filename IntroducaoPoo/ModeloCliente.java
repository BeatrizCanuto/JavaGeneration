package IntroducaoPoo;

public class ModeloCliente {

	String nome;
    int idade;
    int quarto;
    boolean pagamento;
    
    
    public void reserva() {
    	if(this.pagamento == true) {
    		System.out.println("Sua reserva foi confirmada. ");
    	}else {
 
    		System.out.println("Não consta em nosso sistema o pagamento referente a reserva.");
    	}
    }
    
    public void status() {
    	System.out.println("Nome do cliente: " + this.nome);
    	System.out.println("Idade: " + this.idade);
    	System.out.println("Reserva confirmada: " + this.pagamento); 
    }
}
package HerancaPoliformismo;

public class Animal {

		public String nome;
		public int idade;
		public boolean emitirSom; 
		public boolean correr;
		public boolean subir;
	
	
		public void correndo()
		{
			correr = true;    
		}
		public void subindo()
		{
			subir = true;
		}
	
		public void vocalizando()
		{
			emitirSom = true;
		}
		
		public void status()
		{
			
		System.out.println("Nome do animal: " + this.nome);
		System.out.println("Idade:" + this.idade);
		System.out.println("Este animal vocaliza? " + this.emitirSom);
	}
	
}


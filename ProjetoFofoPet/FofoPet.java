package ProjetoFofoPet;

public class FofoPet {
		
		public static void main(String[] args) {
			
			CadastroFofoPet fofopet1 = new CadastroFofoPet();
			CadastroFofoPet fofopet2 = new CadastroFofoPet();
			CadastroFofoPet fofopet3 = new CadastroFofoPet();
			CadastroFofoPet fofopet4 = new CadastroFofoPet();
			CadastroFofoPet fofopet5 = new CadastroFofoPet();
			
			System.out.println("-----------------");
			 fofopet1.fofoPet = "Vicent";
			 fofopet1.idade = 5;
			 fofopet1.ma = " anos";
			 fofopet1.endereço = "Que tal a sua casa...";
			 fofopet1.porte = "G";
			 fofopet1.aceitaOutroPet = true;
			 fofopet1.status();
			System.out.println("");
			
			
			System.out.println("-----------------");
			 fofopet2.fofoPet = "Van";
			 fofopet2.idade = 2;
			 fofopet2.ma = " meses";
			 fofopet2.endereço = "Olha que coincidencia, o mesmo que o seu!";
			 fofopet2.porte = "M";
			 fofopet2.aceitaOutroPet = true;
			 fofopet2.status();
			System.out.println("");
			
			
			System.out.println("-----------------");
			 fofopet3.fofoPet = "Gogh";
			 fofopet3.idade = 1;
			 fofopet3.ma = " mes";
			 fofopet3.endereço = "Hum... o seu?";
			 fofopet3.porte = "P";
			 fofopet3.aceitaOutroPet = true;
			 fofopet3.status();
			System.out.println("");
			
			
			System.out.println("-----------------");
			 fofopet4.fofoPet = "Theo";
			 fofopet4.idade = 12;
			 fofopet4.ma = " anos";
			 fofopet4.endereço = "Queria de frente pra praia pra eu curtir minha aposentadoria";
			 fofopet4.porte = "G";
			 fofopet4.aceitaOutroPet = true;
			 fofopet4.status();
			System.out.println("");
			
			
			System.out.println("-----------------");
			 fofopet5.fofoPet = "Mauricio";
			 fofopet5.idade = 3;
			 fofopet5.ma = " anos";
			 fofopet5.endereço = "Caraca, é literalmente igualzinho ao seu!";
			 fofopet5.porte = "P";
			 fofopet5.aceitaOutroPet = false;
			 fofopet5.status();
			System.out.println("");
			
		}

	}

package ProjetoFofoPet;

public class FofoPet extends MoldeAdotante {
		
		public static void main(String[] args) {
			
			MoldePet fofopet1 = new MoldePet();
			MoldePet fofopet2 = new MoldePet();
			MoldePet fofopet3 = new MoldePet();
			MoldePet fofopet4 = new MoldePet();
			MoldePet fofopet5 = new MoldePet();
			
			System.out.println("-----------------");
			 fofopet1.nome = "Vicent";
			 fofopet1.idade = 5;
			 fofopet1.ma = " anos";
			 fofopet1.endereço = "Que tal a sua casa...";
			 fofopet1.porte = "G";
			 fofopet1.aceitaOutroPet = true;
			 fofopet1.status();
			 fofopet1.restrição();
			System.out.println("");
			
			
			System.out.println("-----------------");
			 fofopet2.nome = "Van";
			 fofopet2.idade = 2;
			 fofopet2.ma = " meses";
			 fofopet2.endereço = "Olha que coincidencia, o mesmo que o seu!";
			 fofopet2.porte = "M";
			 fofopet2.aceitaOutroPet = true;
			 fofopet2.status();
			 fofopet2.restrição();
			System.out.println("");
			
			
			System.out.println("-----------------");
			 fofopet3.nome = "Gogh";
			 fofopet3.idade = 1;
			 fofopet3.ma = " mes";
			 fofopet3.endereço = "Hum... o seu?";
			 fofopet3.porte = "P";
			 fofopet3.aceitaOutroPet = true;
			 fofopet3.status();
			 fofopet3.restrição();
			System.out.println("");
			
			
			System.out.println("-----------------");
			 fofopet4.nome = "Theo";
			 fofopet4.idade = 12;
			 fofopet4.ma = " anos";
			 fofopet4.endereço = "Queria de frente pra praia pra eu curtir minha aposentadoria";
			 fofopet4.porte = "G";
			 fofopet4.aceitaOutroPet = true;
			 fofopet4.status();
			 fofopet4.restrição();
			System.out.println("");
			
			
			System.out.println("-----------------");
			 fofopet5.nome = "Mauricio";
			 fofopet5.idade = 3;
			 fofopet5.ma = " anos";
			 fofopet5.endereço = "Caraca, é literalmente igualzinho ao seu!";
			 fofopet5.porte = "P";
			 fofopet5.aceitaOutroPet = false;
			 fofopet5.status();
			 fofopet5.restrição();
			System.out.println("");
			
		}

	}

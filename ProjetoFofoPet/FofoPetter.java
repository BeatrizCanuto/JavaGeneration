package ProjetoFofoPet; 

public class FofoPetter extends SuperClass{
	public static void main(String[] args) {
		
		MoldeAdotante fofopetter1 = new MoldeAdotante();
		MoldeAdotante fofopetter2 = new MoldeAdotante();
		MoldeAdotante fofopetter3 = new MoldeAdotante();
		MoldeAdotante fofopetter4 = new MoldeAdotante();
		MoldeAdotante fofopetter5 = new MoldeAdotante();
	
		
		System.out.println("-----------------");
		 fofopetter1.nome = "Anderson";
		 fofopetter1.idade = 18;
		 fofopetter1.endereço = "Rua Herança da Silva, 487 - SP";
		 fofopetter1.paiMaeDePet = true;
		 fofopetter1.camasQuentinhas = 2;
		 fofopetter1.contato = "(11) 4002-8922";
		 fofopetter1.status();
		 fofopetter1.disponibilidade();
		System.out.println("");
		
		
		
		System.out.println("-----------------");
		 fofopetter2.nome = "Leo";
		 fofopetter2.idade = 30;
		 fofopetter2.endereço = "Av. Gertulio Tavares Alves, 32 - SP";
		 fofopetter2.paiMaeDePet = false;
		 fofopetter2.camasQuentinhas = 0;
		 fofopetter2.contato = "(21) 92345-9876";
		 fofopetter2.status();
		 fofopetter2.disponibilidade();
		System.out.println("");
		
		
		System.out.println("-----------------");
		 fofopetter3.nome = "Augusto";
		 fofopetter3.idade = 25;
		 fofopetter3.endereço = "Rua Professor Cesar, 10 - SP";
		 fofopetter3.paiMaeDePet = true;
		 fofopetter3.camasQuentinhas = 5;
		 fofopetter3.contato = "(11) 95678-4321";
		 fofopetter3.status();
		 fofopetter3.disponibilidade();
		System.out.println("");
		
		
		System.out.println("-----------------");
		 fofopetter4.nome = "Betina";
		 fofopetter4.idade = 27;
		 fofopetter4.endereço = "Rua Mario Widemann, 17 - RS";
		 fofopetter4.paiMaeDePet = true;
		 fofopetter4.camasQuentinhas = 4;
		 fofopetter4.contato = "(53) 91468-9753";
		 fofopetter4.status();
		 fofopetter4.disponibilidade();
		System.out.println("");
		
		
		System.out.println("-----------------");
		 fofopetter5.nome = "Tia Gen";
		 fofopetter5.idade = 40;
		 fofopetter5.endereço = "Rua Conego Eugenio Leite, 623 - SP";
		 fofopetter5.paiMaeDePet = true;
		 fofopetter5.camasQuentinhas = 5;
		 fofopetter5.contato = "generation.com";
		 fofopetter5.status();
		 fofopetter5.disponibilidade();
		System.out.println("");
		

	}

}

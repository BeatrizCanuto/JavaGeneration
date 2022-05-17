package ProjetoFofoPet;

import java.util.Scanner;

public class CadastroClass extends SuperClass implements InterfaceCadastrar {
	
		Scanner ler = new Scanner(System.in);
		
		// Condicional 
		
		private int condicional;
		
		// Informações em Comum
		private String nome;
	    private int idade;
	    private String endereço;
	    
		// Informações do FOFOPETER
		private boolean paiMaeDePet;
		private int camasQuentinhas;
		private String contato;
		private String email;
		private int quantPets;
		
		// Informações do FOFOPET
		private String ma;
		private String porte;
		private boolean aceitaOutroPet;
		
				
//*************************************************************
		public boolean isPaiMaeDePet() {
			return paiMaeDePet;
		}
		public void setPaiMaeDePet(boolean paiMaeDePet) {
			this.paiMaeDePet = paiMaeDePet;
		}
//*************************************************************
		public int getCamasQuentinhas() {
			return camasQuentinhas;
		}
		public void setCamasQuentinhas(int camasQuentinhas) {
			this.camasQuentinhas = camasQuentinhas;
		}
//*************************************************************
		public int getQuantPets() {
			return quantPets;
		}
		public void setQuantPets(int quantPets) {
			this.quantPets = quantPets;
		}
//*************************************************************	
		public String getContato() {
			return contato;
		}
		public void setContato(String contato) {
			this.contato = contato;
		}
//*************************************************************		
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
//*************************************************************	
		public String getMa() {
			return ma;
		}
		public void setMa(String ma) {
			this.ma = ma;
		}
//*************************************************************		
		public int getCondicional() {
			return condicional;
		}
		public void setCondicional(int condicional) {
			this.condicional = condicional;
		}
//**************************************************************
		public String getPorte() {
			return porte;
		}
		public void setPorte(String porte) {
			this.porte = porte;
		}
//**************************************************************
		public boolean isAceitaOutroPet() {
			return aceitaOutroPet;
		}
		public void setAceitaOutroPet(boolean aceitaOutroPet) {
			this.aceitaOutroPet = aceitaOutroPet;
		}
//*************************************************************
		
		// METODO DE CADASTRO - UTILIZANDO O SOBREPOSIÇÃO 
		
		@Override
		public void cadastro() {
			System.out.println("\n******Bem vindo ao setor de cadastro da FOFOPET******\n");	
			
			System.out.print("Caso dejese realizar o cadastro de um FOFOPET digite (1) ou (2) para realizar o cadastro de um FOFOPETER: ");
			setCondicional(ler.nextInt());
		
		if(condicional == 2) {
			
			System.out.print("\nNome: ");
			setNome(ler.next());
			
			System.out.print("Idade: ");
			setIdade(ler.nextInt());
			
			System.out.print("Endereço: ");
			setEndereço(ler.next());
			
			System.out.print("Telefone: ");
			setContato(ler.next());
			
			System.out.print("Email: ");
			setEmail(ler.next());
			
			System.out.print("Voce já é pai ou mãe um fofopet (true or false) ?:");
			setPaiMaeDePet(ler.nextBoolean());
			
			if(paiMaeDePet == true) {
				
				System.out.print("Quantos FofoPets você tem ?: ");
				setQuantPets(ler.nextInt());
		
			}
			
			if(quantPets > 0) {
				
				System.out.print("\nMuito bem! Vamos indicar o FofoPet que ama fazer amigos!\n");
				
			}
			
			System.out.print("Quantas camas quentinhas você tem disponível: ");
			setCamasQuentinhas(ler.nextInt());
			
			System.out.print("\nObrigado Fofoter e ajudar os Fofopets com um lar temporario, entraremos em contato em breve!!\n");
			
			System.out.println("\n_S2_CADASTRO CONCLUIDO_S2_\n");
			
		}
		
		else if (condicional == 1) {
			
			System.out.print("\nNome: ");
			setNome(ler.next());
			
			System.out.print("Idade: ");
			setIdade(ler.nextInt());
			System.out.print("Mês/Ano: ");
			setMa(ler.next());
			
			System.out.print("Endereço: Espero encontrar um logo!!");
			
			System.out.print("\nQual o porte (P, M, G): ");
			setPorte(ler.next());
			
			System.out.println("Aceita outro pet (true or false)");
			setAceitaOutroPet(ler.hasNext());
			
			System.out.println("\n_S2_CADASTRO CONCLUIDO_S2_\n");
			
			System.out.println(
					
			         "   /\\                    \r\n"
					+"  //\\            //\\    \r\n"
					+" //...)_.------._,/.\\   \r\n"
					+" \\.^,'_.\\....//._..\\)   \r\n"
					+"  `././O\\|...|/O\\../    \r\n"
					+"     \\.\\_/\\_//./       \r\n"
					+"      \\..'.._.`./        \r\n"
					+"       (.:(_):.)          \r\n"
					+"       `._.-._,'          \r\n"
					+"          \\//            \r\n"
					+"..........................\r\n");
			
			
		}
		
		}
}


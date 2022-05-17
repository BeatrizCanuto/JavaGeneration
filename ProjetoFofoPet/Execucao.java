package ProjetoFofoPet;

import java.util.Scanner;

public class Execucao {
	
	private static boolean aceitaOutroPet;

	public static void main(String[] args) {
		
		CadastroClass Cadastro1 = new CadastroClass();
		CadastroClass Cadastro2 = new CadastroClass();
		
		Scanner ler = new Scanner(System.in);
		System.out.println("\n******Bem vindo ao setor de cadastro da FOFOPET******\n");	
		
		System.out.print("Caso dejese realizar o cadastro de um FOFOPET digite (1) ou (2) para realizar o cadastro de um FOFOPETER: ");
		setCondicional(ler.nextInt());
		
		
		System.out.println("__S2___CADASTRO 1___S2___");
		Cadastro1.cadastro();
		
		if (aceitaOutroPet == true) {
			
			System.out.println("Vamos encontrar um lar com muitos amiguinhos!!!");
			
		}
		
		else{
			
			System.out.println("Vamos encontrar um dono solitário, que vai amar sua companhia!!");
			
		}
		
		System.out.println("__S2___CADASTRO 2___S2___");
		Cadastro2.cadastro();
		
	}

	private static void setCondicional(int nextInt) {
		// TODO Auto-generated method stub
		
	}
}


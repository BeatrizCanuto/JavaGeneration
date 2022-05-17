package ProjetoFofopet2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

	public class ClasseFilha extends ClasseMae{

		public static void main(String[] args) {
			
		Scanner ler = new Scanner(System.in);
			int pet = 0;
			
		// OBJETOS *******************************
		ClasseMae pet1 = new ClasseMae();
		ClasseMae pet2 = new ClasseMae();
		
		for( pet = 0; pet < 2 ; pet++ ) {
		
		System.out.print("\n___CADASTRO FOFOPET___\n\n");
		
		System.out.print("Nome: ");
		pet1.setNome(ler.next());
		
		System.out.print("Idade: ");
		pet1.concatenar(ler.next(), ler.next());
		
		System.out.print("Cor: ");
		pet1.setCor(ler.next());
		
		System.out.print("Peso: ");
		pet1.setExceptions(ler.nextInt());
		
		System.out.print("Qual o porte (P, M, G): ");
		pet1.setPorte(ler.next());
		
		System.out.print("Aceita outro pet? (sim ou não): ");
		pet1.setAceitaOutroPet(ler.next());
		
	   // MPRIMIR ATRIBUTOS *******************************
		
		pet1.status();
	    pet1.finalizar(); 
		

		}
	}
}
					
	



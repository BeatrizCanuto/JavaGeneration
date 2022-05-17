package ProjetoFofopet2;

import java.util.InputMismatchException;
import java.util.Scanner;

		// HERAN�A *******************************

public class ClasseFilha extends ClasseMae {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		// OBJETOS *******************************
		
		ClasseMae pet1 = new ClasseMae();
		ClasseMae pet2 = new ClasseMae();
		
		// LA�O DE REPETI��O*******************************
		
		int pet = 0;
		for (pet = 0; pet < 2; pet++) {

			System.out.print("\n___CADASTRO FOFOPET___\n\n");

			System.out.print("Nome: ");
			pet1.setNome(ler.next());

			System.out.print("Idade: ");
			pet1.concatenar(ler.next(), ler.next());

			System.out.print("Cor: ");
			pet1.setCor(ler.next());

		// EXCE��O (TRATAMENTO DE ERROS) *******************************   
		
				
                try {
                    System.out.print("Peso: ");
                    pet1.setPeso(ler.nextInt());
                
                    while(pet1.getPeso() < 0 || pet1.getPeso() > 150)  {
                    System.out.println("Digite um n�mero v�lido...");
                    pet1.setPeso(ler.nextInt());}
                    }
                	  catch (InputMismatchException e) {
                		System.out.println("Voc� digitou um caracter, o programa ser� encerrado."
                				+ "\nInsira um n�mero da pr�xima vez!");
                		break;
                } 
			
		// FIM DA EXCE��O *******************************   
			
			System.out.print("Qual o porte (P, M, G): ");
			pet1.setPorte(ler.next());

			System.out.print("Aceita outro pet? (sim ou n�o): ");
			pet1.setAceitaOutroPet(ler.next());

		// IMPRIMIR  *******************************

			pet1.status();
			System.out.print("");
			pet1.finalizar();

		}
	}
}

package JavaIntrodução;

import java.util.Scanner;

public class Laco3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x = 0, idoso, jovem;
		int contadorI= 0, contadorJ= 0;
		
		
		while(x>-99){
			System.out.println("Digite sua idade: ");
			x = ler.nextInt();
			if(x<21) {
				contadorJ ++;
			}else if(x>50) {
				contadorI++;
			}
		}
		System.out.println("Pessoas com menos de 21 anos = " +contadorJ);
		System.out.println("Pessoas com mais de 50 anos = " + contadorI);
	}	
}


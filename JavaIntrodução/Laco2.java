package JavaIntrodução;

import java.util.Scanner;

public class Laco2 {

	public static void main(String[] args) {
		
		
		int n,contadorP= 0,contadorI= 0;
		Scanner ler = new Scanner(System.in);
		
		for(int x=1; x<11; x++){
			System.out.println("Digite um número: ");
			n = ler.nextInt();
			
			if(n%2==0) {
			contadorP ++;
			
			}else {
			contadorI++;
			
			}
		}System.out.println("Pares: " + contadorP);
		 System.out.println("Impares: " + contadorI);
	}
}
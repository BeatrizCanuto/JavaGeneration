package JavaIntrodução;

import java.util.Scanner;

public class Condicional4 {
	public static void main(String[] args) {
		
		
			Scanner ler = new Scanner(System.in);
			Double n,x;
		
		
		System.out.println("Digite um número: ");
		n= ler.nextDouble();
		
		if(n%2==0){
			System.out.println("Par");
			x= Math.sqrt(n);
			System.out.println("Raiz quadrada = " + x);
		}else {
			System.out.println("Impar");
			x= Math.pow(n,2);
			System.out.println(n+ "² = " + x);
		}
	}
}



package JavaIntrodução;

import java.util.Scanner;

public class Condicional1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int a, b, c;
	
			System.out.print("Digite um número: ");
			a = ler.nextInt();
			System.out.print("Digite um número: ");
			b = ler.nextInt();
			System.out.print("Digite um número: ");
			c = ler.nextInt();
		
		if(a > b && a > c){
			System.out.println(a + " é o maior." );
		}else if(b > a && b > c){
			System.out.println(b + " é o maior." );
		}else {
			System.out.println(c + " é o maior." );
		}
	}

}


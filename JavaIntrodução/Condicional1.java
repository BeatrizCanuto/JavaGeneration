package JavaIntrodu��o;

import java.util.Scanner;

public class Condicional1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int a, b, c;
	
			System.out.print("Digite um n�mero: ");
			a = ler.nextInt();
			System.out.print("Digite um n�mero: ");
			b = ler.nextInt();
			System.out.print("Digite um n�mero: ");
			c = ler.nextInt();
		
		if(a > b && a > c){
			System.out.println(a + " � o maior." );
		}else if(b > a && b > c){
			System.out.println(b + " � o maior." );
		}else {
			System.out.println(c + " � o maior." );
		}
	}

}


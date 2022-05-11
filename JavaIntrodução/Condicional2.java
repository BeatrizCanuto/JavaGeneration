package JavaIntrodução; 

import java.util.Scanner;

public class Condicional2 {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		int a, b, c;

			System.out.println("Digite um número: ");
			a = ler.nextInt();
			System.out.println("Digite um número: ");
			b = ler.nextInt();
			System.out.println("Digite um número: ");
			c = ler.nextInt();
		
		if(a >= b && a >= c && a >= c && c >= b){
			System.out.print(b + "\t"+c + "\t"+a);
			
		} else  if(b >= a && b >= c && a >= c){
			System.out.print(c + "\t"+a + "\t"+b);
			
		}else if(b >= a && b >= c && c >= a){
			System.out.print(a + "\t"+c + "\t"+b);
			
		}else if(c >= a && c >= b && a >= b){
			System.out.print(b + "\t"+a + "\t"+c);
			
		}else{
			System.out.print(a + "\t"+b + "\t"+c);
			
		}
	}
}
	


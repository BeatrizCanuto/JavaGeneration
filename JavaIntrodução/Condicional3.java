package JavaIntrodução;

import java.util.Scanner;

public class Condicional3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x;
		
			System.out.println("Insira sua idade: ");
			x = ler.nextInt();
		
		
		if(x>0 && x<15) {
			System.out.println("Infantil");
		}else if(x>14 && x<18) {
			System.out.println("Juvenil");
		}else {
			System.out.println("Adulto");
		}
	}

}
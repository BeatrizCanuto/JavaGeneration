package JavaIntrodu��o;

import java.util.Scanner;

public class Laco5 {
	Scanner ler = new Scanner(System.in);
	int soma = 0, x;
	
	do {
		System.out.println("Digite um n�mero: ");
		x = ler.nextInt();
		
		soma = soma + x;
		
		
	}while(x != 0);
	System.out.println(soma);
	
	}
}


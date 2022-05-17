package ProjetoFofoPet;

import java.util.*;
import java.math.*;

	public class Excecao extends ClasseFilha {
			Scanner ler = new Scanner(System.in);
			public void excecao() {
				try {
					int x;
					System.out.println("Porte: ");
					x = ler.nextInt();
				}catch(Exception e) {
					System.out.println("Erro!!!\nExceção: " + e);
					System.out.println("Porte: ");
					}
			}
	}
package ProjetoFofoPet;

import java.util.*;
import java.math.*;

	public class Excecao {
	
		public static void main(String[] args) {
			int x;
			Scanner ler = new Scanner(System.in);
			System.out.println("Idade: ");
			try {
				x=ler.nextInt();
				if(x>17) {
					System.out.println("Parabéns, você pode adotar um bichinho.");
				}
			}catch(Exception ) {
				x=ler.nextInt();
				if(x<18) {
				System.out.println("Erro!!!\nAdoção permitida apenas para maiores de 18 anos.");
				}
			}finally {
				System.out.println("\n\n"
						+ "    _=,_\r\n"
						+ "    o_/6 /#\\\r\n"
						+ "    \\__ |##/\r\n"
						+ "     ='|--\\\r\n"
						+ "       /   #'-.\r\n"
						+ "       \\#|_   _'-. /\r\n"
						+ "        |/ \\_( # |\" \r\n"
						+ "       C/ ,--___/");
			}
			

			}
}
	}
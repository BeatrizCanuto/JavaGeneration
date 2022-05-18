package HerancaPoliformismo;

import java.util.ArrayList;
import java.util.Collections;

public class Produto {
    
		public static void main(String[] args) {
			
			int cafe     = 26;
			int filtro   = 50;
			int leite    = 45;
			int coockies = 18;
			int moedor     = 3;
			

			ArrayList<Integer> estoque = new ArrayList<>();

			estoque.add(cafe);
			estoque.add(filtro);
			estoque.add(leite);
			estoque.add(coockies);
			
			//TAMANHO**********************
			System.out.println("\n_____ESTOQUE CAFETERIA_______\n");
			System.out.println(estoque.size());
			System.out.println("");
			System.out.println(estoque);
			System.out.println("");
			
			//ORDENANDO********************
			Collections.sort(estoque);
			System.out.println(estoque);
			System.out.println("");
			
			//REMOVENDO********************
			estoque.remove(2);
			System.out.println(estoque);
			System.out.println("");
			
			//ALTERANDO********************
			estoque.add(moedor);
			Collections.sort(estoque);
			System.out.println(estoque);
			System.out.println("");
			System.out.println(""
					+ ""
					+ ""
					+ "    (  )   (   )  )\r\n"
					+ "     ) (   )  (  (\r\n"
					+ "     ( )  (    ) )\r\n"
					+ "     _____________\r\n"
					+ "    <_____________> ___\r\n"
					+ "    |             |/ _ \\\r\n"
					+ "    |               | | |\r\n"
					+ "    |               |_| |\r\n"
					+ " ___|             |\\___/\r\n"
					+ "/    \\___________/    \\\r\n"
					+ "\\_____________________");
			

	}
}



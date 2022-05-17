package ProjetoFofopet2;

import java.util.ArrayList;
import java.util.Collections;

public class Colletions2 extends ClasseFilha {        

	public static void main(String[] args) {

		String pet1  = "Juju";
		String pet2  = "Sasha";
		String pet3  = "Valentina";
		String pet4  = "Maulicio de Souza";
		String pet5  = "Luigi";
		String pet6  = "Principe";
		String pet7  = "Lesse";
		String pet8  = "Esperança";
		String pet9  = "Luna";
		String pet10 = "Luke";

		ArrayList<String> pet = new ArrayList<>();

		pet.add(pet1) ;
		pet.add(pet2) ;
		pet.add(pet3) ;
		pet.add(pet4) ;
		pet.add(pet5) ;
		pet.add(pet6) ;
		pet.add(pet7) ;
		pet.add(pet8) ;
		pet.add(pet9) ;
		pet.add(pet10);

		// ORDENANDO LISTA *******************************

		Collections.sort(pet);
		
		// PROCURANDO ITEM DENTRO DA LISTA *******************************
		
		if (pet.contains("Juju"))
			System.out.println("Achei!!!!!!\n");
		else
			System.out.println("FofoPet não encontrado.\n");

		// REMOVENDO ÍNDICE *******************************

		System.out.println(pet);
		pet.remove(2);
		System.out.println("");
		System.out.println(pet);

	}
}

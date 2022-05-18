package HerancaPoliformismo;

public class Cachorro extends Animal{

	public static void main(String[] args) {


		Cachorro cachorro1 = new Cachorro();
		Cachorro cachorro2 = new Cachorro();
		Cachorro cachorro3 = new Cachorro();
		
		
		System.out.println("____Cachorro 1____\n");
		cachorro1.nome = "Floquinho";
		cachorro1.raça = "Lhasa Apso";
		cachorro1.idade = 5;
		cachorro1.emitirSom = "Late";
		cachorro1.status();
		cachorro1.correndo();
		System.out.println("");
		
		
		System.out.println("____Cachorro 2____\n");
		cachorro2.nome = "Bidu";
		cachorro2.raça = "Schnauzer";
		cachorro2.idade = 2;
		cachorro2.emitirSom = "Late";
		cachorro2.status();
		cachorro2.correndo();
		System.out.println("");
		
		
		System.out.println("____Cachorro 3____\n");
		cachorro3.nome = "Monicão";
		cachorro3.raça = "SRD";
		cachorro3.idade = 3;
		cachorro3.emitirSom = "Late";
		cachorro3.status();
		cachorro3.parado();
		System.out.println("");
		System.out.println(""
				+ "         __\r\n"
				+ " \\ ______/ V`-,\r\n"
				+ "  }        /~~\r\n"
				+ " /_)^ --,r'\r\n"
				+ "|b      |b");
		}

}



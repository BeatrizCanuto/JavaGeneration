package HerancaPoliformismo;

public class Cavalo extends Animal{
	
	public static void main(String[] args) {


		Cavalo cavalo1 = new Cavalo();
			
			System.out.println("____Cavalo 1____\n");
			cavalo1.nome = "Spirit o corcel indomável";
			cavalo1.raça = "Mustangue";
			cavalo1.idade = 20;
			cavalo1.emitirSom = "Relincha";
			cavalo1.status();
			cavalo1.parado();
			System.out.println("");
			System.out.println(""
					+ "    _ ____\r\n"
					+ "     /( ) _   \\\r\n"
					+ "    / //   /\\` \\,  ||--||--||-\r\n"
					+ "      \\|   |/  \\|  ||--||--||-\r\n"
					+ "~^~^~^~~^~~~^~~^^~^^^^^^^^^^^^");
					
			}

	}

package HerancaPoliformismo;

public class Preguica extends Animal{	
	public static void main(String[] args) {


		Preguica pregui�a1 = new Preguica();
			
			System.out.println("____Pregui�a 1____\n");
			pregui�a1.nome = "Devagar quase parando";
			pregui�a1.ra�a = "Comum";
			pregui�a1.idade = 20;
			pregui�a1.emitirSom = "Bale";
			pregui�a1.status();
			pregui�a1.subindo();
			System.out.println("");
			System.out.println(""
					+ "      * *    \r\n"
					+ "           *    *  *\r\n"
					+ "      *  *    *     *  *\r\n"
					+ "     *     *    *  *    *\r\n"
					+ " * *   *    *    *    *   *\r\n"
					+ " *     *  *    * * .#  *   *\r\n"
					+ " *   *     * #.  .# *   *\r\n"
					+ "  *     \"#.  #: #\" * *    *\r\n"
					+ " *   * * \"#. ##\"       *\r\n"
					+ "   *       \"###\r\n"
					+ "             \"##\r\n"
					+ "              ##.\r\n"
					+ "              .##:\r\n"
					+ "              :###\r\n"
					+ "              ;###\r\n"
					+ "            ,####.\r\n"
					+ "/\\/\\/\\/\\/\\/.######.\\/\\/\\/\\/\\");
					
			}

	}
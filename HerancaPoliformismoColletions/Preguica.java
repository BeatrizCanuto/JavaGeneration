package HerancaPoliformismo;

public class Preguica extends Animal{	
	public static void main(String[] args) {


		Preguica preguiça1 = new Preguica();
			
			System.out.println("____Preguiça 1____\n");
			preguiça1.nome = "Devagar quase parando";
			preguiça1.raça = "Comum";
			preguiça1.idade = 20;
			preguiça1.emitirSom = "Bale";
			preguiça1.status();
			preguiça1.subindo();
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
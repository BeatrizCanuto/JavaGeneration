package IntroducaoPoo;

public class Cliente {
	
		public static void main(String[] args) {
			
			ModeloCliente cliente1 = new ModeloCliente();
			ModeloCliente cliente2 = new ModeloCliente();
			ModeloCliente cliente3 = new ModeloCliente();
			
			System.out.println("Cliente 1");
			cliente1.nome = "Vicent";
			cliente1.idade = 29;
			cliente1.quarto = 1853;
			cliente1.pagamento = true;
			cliente1.status();
			cliente1.reserva();
			System.out.println("");
			
			
			System.out.println("Cliente 2");
			cliente2.nome = "Willem";
			cliente2.idade = 35;
			cliente2.quarto = 1888;
			cliente2.pagamento = false;
			cliente2.status();
			cliente2.reserva();
			System.out.println("");
			
			
			System.out.println("Cliente 3");
			cliente3.nome = "Van Gogh";
			cliente3.idade = 37;
			cliente3.quarto = 1890;
			cliente3.pagamento = true;
			cliente3.status();
			cliente3.reserva();
			System.out.println("");
			
		}

	}


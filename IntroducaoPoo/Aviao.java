package IntroducaoPoo;

public class Aviao {
	
	public static void main(String[] args) {
		
		ModeloAviao aviao1 = new ModeloAviao();
		ModeloAviao aviao2 = new ModeloAviao();
		ModeloAviao aviao3 = new ModeloAviao();
		
		System.out.println("Avião 1");
		aviao1.modelo = "Boeing";
		aviao1.idade = 2;  
		aviao1.manutencao = true;
		aviao1.voando = true;
		aviao1.status();
		aviao1.voar();
		System.out.println("");
		
		
		System.out.println("Avião 2");
		aviao2.modelo = "Boeing";
		aviao2.idade = 2;  
		aviao2.manutencao = true;
		aviao2.voando = false;
		aviao2.status();
		aviao2.voar();
		System.out.println("");
		
		
		System.out.println("Avião 3");
		aviao3.modelo = "Airbus";
		aviao3.idade = 2;  
		aviao3.manutencao = false;
		aviao3.voando = true;
		aviao3.status();
		aviao3.voar();
		System.out.println("");  
		
	}

}


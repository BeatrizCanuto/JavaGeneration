package IntroducaoPoo;

public class ModeloAviao {
	
	String modelo;
    int idade;
    boolean manutencao;
    boolean voando;
    
    
    
    public void voar() {
    	if(this.manutencao == true && this.voando == true) {
    		System.out.println("O avi�o est� voando conforme os protocolos de seguran�a.");
    	}else if(this.manutencao == false && this.voando == true){
    		System.out.println("O avi�o est� voando com risco de queda.");
    	}else {
    		System.out.println("Voc� n�o est� voando.");
    			}
    }
    		
    		public void status() {
    			System.out.println("Modelo do avi�o: " + this.modelo);
    			System.out.println("Idade do avi�o: " + this.idade);
    			System.out.println("Manuten��o: " + this.manutencao);
    			System.out.println("Voando... " + this.voando);
    		}
    	}
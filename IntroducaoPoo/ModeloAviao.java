package IntroducaoPoo;

public class ModeloAviao {
	
	String modelo;
    int idade;
    boolean manutencao;
    boolean voando;
    
    
    
    public void voar() {
    	if(this.manutencao == true && this.voando == true) {
    		System.out.println("O avião está voando conforme os protocolos de segurança.");
    	}else if(this.manutencao == false && this.voando == true){
    		System.out.println("O avião está voando com risco de queda.");
    	}else {
    		System.out.println("Você não está voando.");
    			}
    }
    		
    		public void status() {
    			System.out.println("Modelo do avião: " + this.modelo);
    			System.out.println("Idade do avião: " + this.idade);
    			System.out.println("Manutenção: " + this.manutencao);
    			System.out.println("Voando... " + this.voando);
    		}
    	}
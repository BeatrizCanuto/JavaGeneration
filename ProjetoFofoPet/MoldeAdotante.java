package ProjetoFofoPet;

public class MoldeAdotante extends SuperClass{

		public boolean paiMaeDePet;
		public int camasQuentinhas;
		public String contato;
      
    public boolean isPaiMaeDePet() {
			return paiMaeDePet;
		}

		public void setPaiMaeDePet(boolean paiMaeDePet) {
			this.paiMaeDePet = paiMaeDePet;
		}

		public int getCamasQuentinhas() {
			return camasQuentinhas;
		}

		public void setCamasQuentinhas(int camasQuentinhas) {
			this.camasQuentinhas = camasQuentinhas;
		}

		public String getContato() {
			return contato;
		}

		public void setContato(String contato) {
			this.contato = contato;
		}

	public void disponibilidade () {
    	if (camasQuentinhas >= 1 ){
    		System.out.println("Parabéns, em breve a família estará completa!!!");
    	} else {
    		System.out.println("Poxa que pena, preencha o formulário novamente quando puder oferecer camas quentinhas <3");
    	}
    }
    
    public void status() {
    	System.out.println("Tudo que precisamos saber sobre o FofoPetter...\n");
    	System.out.println("Nome: " + this.nome);
    	System.out.println("Idade: " + this.idade);
    	System.out.println("Endereço: " + this.endereço);
    	System.out.println("Você tem algum pet em casa? " + this.paiMaeDePet);
    	System.out.println("Quantas vagas você pode oferecer: " + this.camasQuentinhas);
    	System.out.println("Contato: " + this.contato);
    }
}



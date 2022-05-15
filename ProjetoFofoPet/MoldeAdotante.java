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
    		System.out.println("Parab�ns, em breve a fam�lia estar� completa!!!");
    	} else {
    		System.out.println("Poxa que pena, preencha o formul�rio novamente quando puder oferecer camas quentinhas <3");
    	}
    }
    
    public void status() {
    	System.out.println("Tudo que precisamos saber sobre o FofoPetter...\n");
    	System.out.println("Nome: " + this.nome);
    	System.out.println("Idade: " + this.idade);
    	System.out.println("Endere�o: " + this.endere�o);
    	System.out.println("Voc� tem algum pet em casa? " + this.paiMaeDePet);
    	System.out.println("Quantas vagas voc� pode oferecer: " + this.camasQuentinhas);
    	System.out.println("Contato: " + this.contato);
    }
}



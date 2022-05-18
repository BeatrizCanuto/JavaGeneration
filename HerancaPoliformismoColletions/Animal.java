package HerancaPoliformismo;

public class Animal {

	public String nome;
	public String ra�a;
	public int idade;
	public String emitirSom;
	private String correr;
	private String subir;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRa�a() {
		return ra�a;
	}

	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmitirSom() {
		return emitirSom;
	}

	public void setEmitirSom(String emitirSom) {
		this.emitirSom = emitirSom;
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}

	public String getSubir() {
		return subir;
	}

	public void setSubir(String subir) {
		this.subir = subir;
	}
	public void subindo(){
			System.out.println("O animal est� subindo...");
	}
	public void correndo(){
			System.out.println("O animal est� correndo...");
	}
	public void parado() {
	System.out.println("O animal est� parado.");
	}
	public void status() {
		System.out.println("Nome do animal: " + this.nome);
		System.out.println("Ra�a: " + this.ra�a);
		System.out.println("Idade:" + this.idade);
		System.out.println("Que som esse animal faz? " + this.getEmitirSom());
	
	}

}

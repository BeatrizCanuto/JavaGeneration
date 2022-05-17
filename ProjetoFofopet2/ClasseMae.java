package ProjetoFofopet2;

import java.util.*;

public class ClasseMae implements Interface {   
	Scanner ler = new Scanner(System.in);
	
		// ATRIBUTOS  *******************************
	
	private String nome;
	private String idade;
	private String endereço;
	private String cor;
	private int peso;
	private String porte;
	private String aceitaOutroPet;

		// MÉTODOS E ENCAPSULAMENTO *******************************

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getAceitaOutroPet() {
		return aceitaOutroPet;
	}

	public void setAceitaOutroPet(String aceitaOutroPet) {
		this.aceitaOutroPet = aceitaOutroPet;
	}

	public void setIdadeMesAno(String idadeMesAno) {
		this.idadeMesAno = idadeMesAno;
	}

		// SOBRECARGA *******************************

	private String idadeMesAno;

	public String concatenar(String idade, String nome) {

		this.idadeMesAno = idade + " " + nome;
		return idadeMesAno;
	}
	public String concatenar(int idade, String nome) {

		this.idadeMesAno = idade + " " + nome;
		return idadeMesAno;
	}

		// SOBREPOSIÇÃO *******************************

	@Override
	public void status() {
		System.out.println("\nTudo que você precisa saber sobre os FofoPets!\n");
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idadeMesAno);
		System.out.println("Endereço: Espero encontrar o meu logo...");
		System.out.println("Cor: " + this.cor);
		System.out.println("Peso: " + this.peso + " kg");
		System.out.println("Porte: " + this.porte);
		System.out.println("Aceita outro pet? " + this.aceitaOutroPet);

	}

	@Override
	public void finalizar() {
		System.out.println("\n___CADASTRO CONCLUIDO___\n");

		System.out.println(
				
		         "   /\\                    \r\n"
				+"  //\\            //\\    \r\n"
				+" //...)_.------._,/.\\   \r\n"
				+" \\.^,'_.\\....//._..\\)   \r\n"
				+"  `././O\\|...|/O\\../    \r\n"
				+"     \\.\\_/\\_//./       \r\n"
				+"      \\..'.._.`./        \r\n"
				+"       (.:(_):.)          \r\n"
				+"       `._.-._,'          \r\n"
				+"          \\//            \r\n"
				+"..........................\r\n");
		
		
	}

}

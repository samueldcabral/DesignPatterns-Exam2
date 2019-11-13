package model;

public class Arquivo implements Component{
	private String nome;
	private double tamanhoKb;
	
	public Arquivo() {}
	
	public Arquivo(String nome, double tamanhoKb) {
		super();
		this.nome = nome;
		this.tamanhoKb = tamanhoKb;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getTamanhoKb() {
		return tamanhoKb;
	}
	public void setTamanhoKb(double tamanhoKb) {
		this.tamanhoKb = tamanhoKb;
	}

	public void imprimir() {
		System.out.println("Arquivo\nNome: " + this.nome + "\nTamanho: " + this.tamanhoKb + "kb\n");
	}
}

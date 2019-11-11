package model;

public class Numero{
	protected int numero;
	
	public Numero() {}
	
	public Numero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String imprimir() {
		return "" + numero;
	}
}

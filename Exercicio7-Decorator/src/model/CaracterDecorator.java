package model;

public class CaracterDecorator extends Numero{
	private Numero numero;
	protected String abreCaracter;
	protected String fechaCaracter;
	
	public CaracterDecorator(Numero numero) {
		this.numero = numero;
	}
	
	public String imprimir() {
		String numeroPai = numero.imprimir();
		return abreCaracter + numeroPai + fechaCaracter;
	}
}

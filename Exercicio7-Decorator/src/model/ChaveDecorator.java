package model;

public class ChaveDecorator extends CaracterDecorator {

	public ChaveDecorator(Numero numero) {
		super(numero);
		abreCaracter = "{";
		fechaCaracter = "}";
	}
}

package model;

public class ColcheteDecorator extends CaracterDecorator {

	public ColcheteDecorator(Numero numero) {
		super(numero);
		abreCaracter = "[";
		fechaCaracter = "]";
	}
}

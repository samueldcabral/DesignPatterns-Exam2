package model;

public class ParentesisDecorator extends CaracterDecorator {

	public ParentesisDecorator(Numero numero) {
		super(numero);
		abreCaracter = "(";
		fechaCaracter = ")";
	}

}

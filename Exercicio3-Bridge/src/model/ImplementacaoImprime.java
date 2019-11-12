package model;

public abstract class ImplementacaoImprime {
	
	protected AbstracaoLista minhaLista;

	public ImplementacaoImprime(AbstracaoLista lista) {
		minhaLista = lista;
	}
		
	public abstract void imprimir();
}

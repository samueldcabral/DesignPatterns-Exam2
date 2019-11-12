package model;

public abstract class AbstracaoTamanho {
	
	protected ImplementacaoRefrigerante refrigerante;
	protected String tamanho;
	
	public AbstracaoTamanho(ImplementacaoRefrigerante refri) {
		this.refrigerante = refri;
	}
	
	public abstract void beber();
}

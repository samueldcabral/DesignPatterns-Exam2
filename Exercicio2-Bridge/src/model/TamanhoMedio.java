package model;

public class TamanhoMedio extends AbstracaoTamanho {
	
	public TamanhoMedio(ImplementacaoRefrigerante refri) {
		super(refri);
		tamanho = "Tamanho médio";
	}
	
	public void beber()  {
		System.out.println("Toma um gole de " + refrigerante + " " + tamanho);
		System.out.println("Toma um gole de " + refrigerante + " " + tamanho);
		System.out.println("Acabou o(a) " + refrigerante);
		System.out.println();
	}
}

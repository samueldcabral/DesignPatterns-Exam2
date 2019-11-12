package model;

public class TamanhoFamilia extends AbstracaoTamanho{
	
	public TamanhoFamilia(ImplementacaoRefrigerante refri) {
		super(refri);
		tamanho = "Tamanho Familia";
	}
	
	public void beber()  {
		System.out.println("Toma um gole de " + refrigerante + " " + tamanho);
		System.out.println("Toma um gole de " + refrigerante + " " + tamanho);
		System.out.println("Toma um gole de " + refrigerante + " " + tamanho);
		System.out.println("Toma um gole de " + refrigerante + " " + tamanho);
		System.out.println("Acabou o(a) " + refrigerante);
		System.out.println();
	}
}

package app;

import model.AbstracaoTamanho;
import model.CocaCola;
import model.Fanta;
import model.Guarana;
import model.ImplementacaoRefrigerante;
import model.Jesus;
import model.Sprite;
import model.TamanhoFamilia;
import model.TamanhoGokuComFome;
import model.TamanhoGrande;
import model.TamanhoMedio;
import model.TamanhoPequeno;

public class App {

	public static void main(String[] args) {
		ImplementacaoRefrigerante guara = new Guarana();
		AbstracaoTamanho tamanhoPequeno = new TamanhoPequeno(guara);
		
		tamanhoPequeno.beber();
		
		ImplementacaoRefrigerante coca = new CocaCola();
		AbstracaoTamanho tamanhoMedio = new TamanhoMedio(coca);
		
		tamanhoMedio.beber();
		
		ImplementacaoRefrigerante sprite = new Sprite();
		AbstracaoTamanho tamanhoGrande = new TamanhoGrande(sprite);
		
		tamanhoGrande.beber();
		
		ImplementacaoRefrigerante fanta = new Fanta();
		AbstracaoTamanho tamanhoFamilia = new TamanhoFamilia(fanta);
		
		tamanhoFamilia.beber();
		
		ImplementacaoRefrigerante jesus = new Jesus();
		AbstracaoTamanho tamanhoGoku = new TamanhoGokuComFome(jesus);
		
		tamanhoGoku.beber();

	}

}

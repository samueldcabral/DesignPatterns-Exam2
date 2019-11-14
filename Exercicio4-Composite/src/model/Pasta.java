package model;

import java.util.ArrayList;

public class Pasta implements Component {
	private String nome;
	private int quantidadeArquivos;
	private int quantidadeSubPastas;
	private ArrayList<Component> arquivos = new ArrayList<>();
	private ArrayList<Component> subpastas = new ArrayList<>();

	public Pasta(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Component> getArquivos() {
		return arquivos;
	}

	public void setArquivos(ArrayList<Component> arquivos) {
		this.arquivos = arquivos;
	}

	public void addArquivos(Arquivo arquivo) {
		this.arquivos.add(arquivo);
	}
	
	public void removeArquivos(Arquivo arquivo) {
		this.arquivos.remove(arquivo);
	}
	
	public ArrayList<Component> getSubpastas() {
		return subpastas;
	}

	public void setSubpastas(ArrayList<Component> subpastas) {
		this.subpastas = subpastas;
	}

	public void addSubPasta(Pasta subpasta) {
		this.subpastas.add(subpasta);
	}
	
	public void removeSubPasta(Pasta subpasta) {
		this.subpastas.remove(subpasta);
	}

	public void imprimir() {
		this.quantidadeArquivos = arquivos.size();
		this.quantidadeSubPastas = subpastas.size();
		
		System.out.println("Pasta: " + this.nome + " tem " + this.quantidadeArquivos + " arquivos e " + this.quantidadeSubPastas + " subpastas.\n");

		for(Component arquivo : arquivos) {
			arquivo.imprimir();
		}
		
		for(Component pasta : subpastas) {
			pasta.imprimir();
		}
	}

}

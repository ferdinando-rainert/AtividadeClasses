package main.model;

public class Produto {
	
	public String nome;
	public double preco;
	public double desconto;
	
	public Produto(String nomeInicial){
		this.nome = nomeInicial;
	}
	//para poder criar sem nenhum dado inicial
	public Produto() {
		
	}
	
}

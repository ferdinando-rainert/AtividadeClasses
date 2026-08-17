package main.model;

public class Produto {
	
	public String nome;
	public double preco;
	public double desconto;
	
	 public double precoComDesconto() {
		 
	        return preco * (1 - (desconto));
	        
	}
	
}

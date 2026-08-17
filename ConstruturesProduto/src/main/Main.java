package main;

import java.io.Closeable;
import java.util.Scanner;

import main.model.Produto;


public class Main {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook");
		
		//p1.nome = "Notebook";
		p1.preco = 122.0;
		p1.desconto = 0.2;
		
		var p2 = new Produto("Celular");
		
		//p2.nome = "Celular";
		p2.preco = 100.5;
		p2.desconto = 0.1;
		
		double precoFinal1 =  p1.preco * (1-p1.desconto);
		double precoFinal2 =  p2.preco * (1-p2.desconto);
		
		double media = (precoFinal1 + precoFinal2)/2;
		
		System.out.println("Valores:");
		System.out.println(p1.nome + " " + precoFinal1);
		System.out.println(p2.nome + " " + precoFinal2);
		System.out.println("Média: " + media);
	}
}
package main;

import main.model.Data;

public class Main {

	public static void main(String[] args) {
		
		Data d1 = new Data();

		d1.dia = 01;
		d1.mes = 01;
		d1.ano = 2002;
		
		Data d2 = new Data();

		d2.dia = 02;
		d2.mes = 02;
		d2.ano = 2002;
		
		System.out.printf("%d/%d/%d\n", d1.dia, d1.mes, d1.ano);
		System.out.printf("%d/%d/%d", d2.dia, d2.mes, d2.ano);
	}

}

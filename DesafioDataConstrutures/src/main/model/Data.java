package main.model;

public class Data {
	
	public int dia;
	public int mes;
	public int ano;
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public Data() {
		
	}

	public String obterData() {
		return String.format("%d/%d/%d\n", dia, mes, ano);
	}
	
}

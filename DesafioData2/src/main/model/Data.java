package main.model;

public class Data {
	
	public int dia;
	public int mes;
	public int ano;
	
	public String obterData() {
		return String.format("%d/%d/%d\n", dia, mes, ano);
	}
	
}

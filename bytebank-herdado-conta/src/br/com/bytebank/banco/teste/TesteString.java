package br.com.bytebank.banco.teste;

public class TesteString {
	public static void main(String[] args) {
		
		String nome1 = "Matheus";
		String nome2 = new String("Matheus");
		
		System.out.println(nome1);
		System.out.println(nome2);
		
		nome1 = nome1.toUpperCase();
		System.out.println(nome1);
	}
}

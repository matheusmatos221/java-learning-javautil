package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(123, 1);
		ContaPoupanca cp = new ContaPoupanca(123, 2);
		
		System.out.println(cc);
		System.out.println(cp);
		
		
	}
}

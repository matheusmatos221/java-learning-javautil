package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencias {
	public static void main(String[] args) {
		ContaCorrente[] contasCorrentes = new ContaCorrente[5];
		
		ContaCorrente cc1 = new ContaCorrente(123, 12);
		ContaCorrente cc2 = new ContaCorrente(123, 24);
		
		contasCorrentes[0] = cc1;
		contasCorrentes[1] = cc2;
		
		System.out.println(contasCorrentes[0].getNumero());
		
	}
}

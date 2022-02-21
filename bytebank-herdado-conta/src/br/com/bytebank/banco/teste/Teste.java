package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class Teste {
	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(123, 11);
		guardador.adicionar(cc);
		
		Conta cp = new ContaPoupanca(123, 22);
		guardador.adicionar(cp);
		
		int tamanho = guardador.getQuantidadeElementos();
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencia(1);
		System.out.println(ref.getNumero());
	}
}

package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {
	public static void main(String[] args) {
		
		// instancia nova ArrayList();
		ArrayList lista = new ArrayList();
		
		// instance new objects 'conta'
		Conta cc1 = new ContaCorrente(123, 11);
		Conta cc2 = new ContaCorrente(123, 22);
		Conta cp1 = new ContaPoupanca(123, 55);
		Conta cp2 = new ContaPoupanca(123, 66);
		
		// ADD instances to list 'lista'
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cp1);
		lista.add(cp2);
		
		// console.log -  Tamanho da lista
		System.out.println("Tamanho da Lista: "+ lista.size());
		
		// não funciona porque o objeto do do tipo Object nao possui o metodo get
		//Conta ref = lista.get(0);
		
		// funciona porque foi inserido type cast
		Conta ref = (Conta) lista.get(0);
		
		// Jeito antigo
		System.out.println("Jeito ANTIGO");
		for(int i=0 ; i<lista.size() ; i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("----------------");
		System.out.println("Jeito NOVO");
		
		for(Object conta : lista) {
			System.out.println(conta);
		}
		
	}
}

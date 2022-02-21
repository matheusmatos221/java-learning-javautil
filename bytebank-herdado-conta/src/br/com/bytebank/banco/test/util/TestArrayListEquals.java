package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestArrayListEquals {

	public static void main(String[] args) {
		// Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		// Instancia novas contas
		Conta cc1 = new ContaCorrente(22, 11);
		Conta cc2 = new ContaCorrente(22, 22);
		
		// Adiciona à lista
		lista.add(cc1);
		lista.add(cc2);
		
		boolean existe = lista.contains(cc1);
		System.out.println("Já existe? " + existe);
		
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
				
	}

}

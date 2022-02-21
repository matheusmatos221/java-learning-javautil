package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import java.util.ArrayList;

public class TesteArrayList2 {
	public static void main(String[] args) {
		
		// instancia nova ArrayList();
		ArrayList<Conta> contas = new ArrayList<Conta>();
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		// instance new objects 'Cliente'
		// ADD instances to ArrayList 'clientes'
		Cliente c1 = new Cliente("Matheus");
		clientes.add(c1);
		Cliente c2 = new Cliente("Henrique");
		clientes.add(c2);
		Cliente c3 = new Cliente("Jose");
		clientes.add(c3);
		Cliente c4 = new Cliente("Jorge");
		clientes.add(c4);
		
		// instance new objects 'conta'
		// ADD instances to list 'lista'
		Conta cc1 = new ContaCorrente(123, 11);
		contas.add(cc1);
		Conta cc2 = new ContaCorrente(123, 22);
		contas.add(cc2);
		Conta cp1 = new ContaPoupanca(123, 55);
		contas.add(cp1);
		Conta cp2 = new ContaPoupanca(123, 66);
		contas.add(cp2);
		
		
		
		// console.log -  Tamanho da lista
		System.out.println("Tamanho da Lista: "+ contas.size());
		
		// não funciona porque o objeto do do tipo Object nao possui o metodo get
		//Conta ref = lista.get(0);
		
		// funciona porque foi inserido type cast
		Cliente ref = (Cliente) clientes.get(0);
		
		
		// CONSOLE LOG
//		
//		// Jeito antigo
//		System.out.println("Jeito ANTIGO");
//		for(int i=0 ; i<contas.size() ; i++) {
//			System.out.println(contas.get(i));
//		}
//		
//		System.out.println("----------------");
//		System.out.println("Jeito NOVO");
//		
//		for(Object conta : contas) {
//			System.out.println(conta);
//		}
		
		// for with generics '<cliente>'
		for(Cliente cli : clientes) {
			System.out.println(cli.getNome());
		}
		
	}
}

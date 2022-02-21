/**
 * Classe de teste para arrays e referencias
 * @author Matheus
 *
 */

package br.com.bytebank.banco.teste;

// Imports
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;


public class TesteArrayReferencias {
	public static void main(String[] args) {
		Conta[] contas = new Conta[5];
		
		ContaCorrente cc1 = new ContaCorrente(123, 12);
		ContaCorrente cc2 = new ContaCorrente(123, 24);
		
		contas[0] = cc1;
		contas[1] = cc2;
		
		System.out.println(contas[0].getNumero());
		
	}
}

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
		// cria novo array
		Conta[] contas = new Conta[5];
		
		// cria novas instancias de conta corrente e poupanca
		ContaCorrente cc = new ContaCorrente(123, 12);
		ContaPoupanca cp = new ContaPoupanca(123, 24);
		
		// insere referencias no array
		contas[0] = cc;
		contas[1] = cp;
		
		// nao compila
		// ContaCorrente ref = contas[0];
		
		// compila porque faz uso do type cast
		ContaCorrente ref = (ContaCorrente) contas[0];

		// ClassCastException ContaPoupanca in ContaCorrente type
		//ContaCorrente ref1 = (ContaCorrente) contas[1];
		
		// console.log
		System.out.println(contas[0].getNumero());
		System.out.println(ref.getNumero());
		
	}
}

/**
 * Classe GuardadorDeContas
 * 
 * Guarda contas em um array e deixa disponível para ser utilizado através
 * da sintaxe padrão para OO do Java
 * 
 * @author Matheus Matos
 */

package br.com.bytebank.banco.modelo;


public class GuardadorDeContas {

	private Conta[] referencias;
	private int cursorElement;
	
	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		this.cursorElement = 0;
	}

	public void adicionar(Conta ref) {
		this.referencias[this.cursorElement] = ref;
		this.cursorElement++;
	}

	public int getQuantidadeElementos() {
		return this.cursorElement;
	}

	public Conta getReferencia(int indice) {
		return this.referencias[indice];
	}
}

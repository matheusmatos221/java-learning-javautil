/**
 * Classe GuardadorDeReferencias
 * 
 * Guarda contas em um array e deixa disponível para ser utilizado através
 * da sintaxe padrão para OO do Java
 * 
 * @author Matheus Matos
 */

package br.com.bytebank.banco.modelo;


public class GuardadorDeReferencias {

	private Object[] referencias;
	private int cursorElement;
	
	public GuardadorDeReferencias() {
		this.referencias = new Object[10];
		this.cursorElement = 0;
	}

	public void adicionar(Object ref) {
		this.referencias[this.cursorElement] = ref;
		this.cursorElement++;
	}

	public int getQuantidadeElementos() {
		return this.cursorElement;
	}

	public Object getReferencia(int indice) {
		return this.referencias[indice];
	}
}

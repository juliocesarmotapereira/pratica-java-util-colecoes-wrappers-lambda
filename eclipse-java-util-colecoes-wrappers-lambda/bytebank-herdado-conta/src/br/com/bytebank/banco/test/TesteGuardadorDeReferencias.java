package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteGuardadorDeReferencias {

	public static void main(String[] args) {

		GuardadorDeReferencias guardador = new GuardadorDeReferencias();

		Conta cc = new ContaCorrente(111, 333);
		guardador.adiciona(cc);

		Conta cc2 = new ContaCorrente(111, 444);
		guardador.adiciona(cc2);

		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);

		Conta ref = (Conta) guardador.getReferencia(1);
		System.out.println(ref.getNumero());
	}
}

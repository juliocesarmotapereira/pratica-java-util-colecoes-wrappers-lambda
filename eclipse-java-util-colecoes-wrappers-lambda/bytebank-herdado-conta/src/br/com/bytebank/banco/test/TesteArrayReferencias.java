package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {

		// int[] idades = new int[5];
		Object[] referencias = new Object[5];

		System.out.println(referencias.length);

		ContaCorrente cc1 = new ContaCorrente(222, 555);
		referencias[0] = cc1;

		ContaPoupanca cc2 = new ContaPoupanca(222, 666);
		referencias[1] = cc2;

		Cliente cliente = new Cliente();
		referencias[2] = cliente;

		// Object referenciaGenerica = conta[1];
		// System.out.println(contas[1].getNumero());

		ContaPoupanca ref = (ContaPoupanca) referencias[1]; // type cast
		System.out.println(ref.getNumero());

		System.out.println(cc2.getNumero());
	}
}

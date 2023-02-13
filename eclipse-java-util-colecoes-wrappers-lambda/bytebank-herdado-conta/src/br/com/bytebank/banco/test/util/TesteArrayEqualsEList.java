package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayEqualsEList {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(100, 111);
		Conta cc2 = new ContaCorrente(100, 111);

		// boolean igual = cc1.ehIgual(cc2);
		// System.out.println(igual);
	}
}

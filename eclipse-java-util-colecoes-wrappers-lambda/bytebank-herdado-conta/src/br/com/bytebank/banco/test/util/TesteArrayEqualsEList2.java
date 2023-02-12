package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayEqualsEList2 {

	public static void main(String[] args) {

		// Generics
		// ArrayList<String> nomes = new ArrayList<String>();

		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc = new ContaCorrente(100, 111);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(100, 222);
		lista.add(cc2);

		Conta cc3 = new ContaCorrente(100, 222);
		boolean existe = lista.contains(cc3);
		
		System.out.println("Já existe? " + existe);


		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}
}

package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {

	public static void main(String[] args) {

		// Generics
		// ArrayList<String> nomes = new ArrayList<String>();
		
		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc = new ContaCorrente(100, 111);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(100, 222);
		lista.add(cc2);

		System.out.println("Tamanho: " + lista.size());
		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());
		lista.remove(0);

		Conta cc3 = new ContaCorrente(100, 333);
		lista.add(cc3);

		Conta cc4 = new ContaCorrente(100, 444);
		lista.add(cc4);

		for (int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}

		System.out.println("-----------------------------------------");

		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}
}

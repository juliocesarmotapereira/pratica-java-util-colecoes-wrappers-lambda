## Prática de Java e java.util: Coleções, Wrappers e Lambda expressions

Material de estudos práticos do Programa ONE da Oracle

### Anotações

* Array []:  são objetos, primeira posição indicada pelo index 0, inicializado com os valores padrões, é uma estrutura de dados.
* NullPointerException: acessando um elemento do array quando a posição está null.
* ArrayIndexOutOfBoundException: acessar uma posição inválida recebemos estáa exceção.
* Alterar a mesma palavra em varios lugares: Refactor > Rename.
* Type Cast: conversão de um tipo para outro.
* Cast explícito e implícito.
* ClassCastException: é um unchecked pois estende RuntimeException.
* ArrayList: guarda referências, é do pacote java.util, usa internamente um array, é um array dinâmico.
* java.util.ArrayList: é um guardador de referências e usa um array internamente, o único limite é a memória da JVM, encapsula o uso do array e oferece vários métodos de mais alto nível.

* public boolean equals(Object ref): é publico, devolve boolean e recebe um Object.
* Método equals: devemos sobrescrever o método equals para definir a igualdade do objeto, a implementação do método equals da classe Object compara apenas as referências, é definido na classe Object.
* Métodos equals, toString e hashCode existem para sobrescrita.
* Pacote java.util: List é uma interface, a ArrayList e a LinkedList são implementações, todas as listas garantem a ordem de inserção e possuem um índice.
* A classe java.util.Arrays possui vários métodos estáticos auxiliares para trabalhar com arrays.
* java.util.LinkedList, ArrayList, LinkedList, java.util.List

* java.util.Vector é uma ArrayList thread safe.
* Vector: threadsafe, usa um array por baixo, é uma lista.
* java.util.Collection é a interface de todas as coleções.
* Pacote java.util (API de Collections)
* java.util.Set também são coleções, mas não aceitam duplicados nem são listas.
* java.util.Map

* Tipo primito int > Autoboxing > para objeto java.lang.Integer.
* TIpo objeto java.lang.Interger > Unboxing > para o tipo primitivo
* Wrapper: são classes que contém funcionalidades e encapsulam a variável de tipo primitivo.
* A criação do objeto Wrapper é chamada de autoboxing. 
* A retirada do valor primitivo do objeto Wrapper é chamada de unboxing.


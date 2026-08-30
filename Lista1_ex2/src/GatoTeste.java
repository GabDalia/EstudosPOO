
//Exercício 2 – Crie uma classe chamada GatoTeste com o método main
//A – crie 3 instâncias de Gato. Atribua a cada uma das instâncias valores para as
//variáveis vivo, cor, idade, nome de forma que cada instância tenha valores
//diferentes.
//B – imprima o valor dos atributos de cada Gato no console. O valor dos
//atributos de cada Gato deve estar em uma linha, ou seja, um System.out para
//cada objeto.

import GatoTeste.Gato;

public class GatoTeste {

	public static void main(String[] args) {
		Gato gato1 = new Gato();
		gato1.nome = "Fred";
		gato1.cor = "marrom";
		gato1.idade = 11;
		gato1.vivo = true;
		
		Gato gato2 = new Gato();
		gato2.nome = "Mia";
		gato2.cor = "siames";
		gato2.idade = 3;
		gato2.vivo = true;
		
		Gato gato3 = new Gato();
		gato3.nome = "Lindinho";
		gato3.cor = "preto";
		gato3.idade = 16;
		gato3.vivo = false;
		
		System.out.println(gato1.nome); 
		System.out.println(gato1.cor);
		System.out.println(gato1.idade);
		System.out.println(gato1.vivo);
		
		System.out.println(gato2.nome); 
		System.out.println(gato2.cor);
		System.out.println(gato2.idade);
		System.out.println(gato2.vivo);
		
		System.out.println(gato3.nome);
		System.out.println(gato3.cor);
		System.out.println(gato3.idade);
		System.out.println(gato3.vivo);
		

	}
	

	public static class Gato {//perguntar pro gustavo
		String nome;
		String cor;
		int idade;
		boolean vivo;
	}


}

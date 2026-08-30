//Exercício 3 – Imprima a soma de todos os números ímpares de 1 a 10.000.

public class principal {

	public static void main(String[] args) {
		int soma = 0;
		
		for(int i = 0; i<10000; i++) {
			if(i%2!=0) {
				soma += i;
			}
		}
		System.out.println(soma);
	}

}

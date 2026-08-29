//Exercício 6 – Crie uma nova classe chamada TestaCasaJanela com o método
//main.
//A- Crie um novo objeto Janela e atribua valores a ele.
//B- Crie um novo objeto Casa e atribua valores a ele, inclusive a Janela criada
//acima (item A).
//C- Faça o debug e entenda o que acontece.
//D- A partir da referencia da Casa, imprima os valores dos atributos da casa e
//da janela.

public class TestaCasaJanela {

	public static void main(String[] args) {
		Janela janela1 = new Janela();
		janela1.cor = "Rosa";
		janela1.material = "Madeira";
		
		Casa casa1 = new Casa();
		casa1.cor = "Verde";
		casa1.numero = 190;
		casa1.janela = janela1; //ponteiro
		
		System.out.println("A casa número " + casa1.numero + " da cor "+ casa1.cor + " tem janelas feitas de " + casa1.janela.material + " de cor " + casa1.janela.cor);

	}

}

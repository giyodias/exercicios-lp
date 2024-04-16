package aula1;

public class ex09 {

	public static void main(String[] args) {
		// uma árvore (árvore 1) tem 1,50m e cresce 2cm por ano. Uma outra árvore (árvore 2) tem 1,10m e cresce 3cm por ano. Construa um programa que calcule em quantos anos a árvore 2 será maior que árvore 1.
		
	double arvore1 = 1.50;
	double crescimentoArvore1 = 0.02;
	
	double arvore2 = 1.10;
	double crescimentoArvore2 = 0.03;
	
	int anos = 0;
	
		while(arvore2 < arvore1) {
			arvore1 = arvore1 + crescimentoArvore1;
			arvore2 = arvore2 + crescimentoArvore2;
			anos++;
		}
		
		System.out.println("A árvore 2 demorou " + anos + " anos para se tornar maior que a árvore 1.");
	}

}

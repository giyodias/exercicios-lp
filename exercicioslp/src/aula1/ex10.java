package aula1;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		// escrever um programa (usando a estrutura for) para ler 20 valores, um de cada vez, para a variável x. Contar quantos destes valores são neativos, mostrando os mesmos e escrevendo a quantidade ao final.
		
		
		double[] valoresNegativos = new double[20];
		double x;
		int qtNegativos = 0;
		int tamanhoVetor = 20;
		
		
		Scanner leia = new Scanner(System.in);
				
				
		for(int i = 0; i < tamanhoVetor; i++) {
			System.out.println("Digite um valor: ");
			x = leia.nextDouble();
			
			if(x < 0) {
				valoresNegativos[i] = x;
				qtNegativos ++;
			}
		}
		
		System.out.println("Os números negativos são: ");
		
		for(int i = 0; i < tamanhoVetor; i++) {
			
			if(valoresNegativos[i] != 0) {
				System.out.println(valoresNegativos[i]);
			}
			
		}
		
		System.out.println("A quantidade total de números negativos foi: " + qtNegativos);
		
		leia.close();
	}

}

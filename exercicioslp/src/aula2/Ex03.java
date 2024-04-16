package aula2;
import java.util.Scanner;

public class Ex03 {


	public static void main(String[] args) {
		// Crie um programa usando o conceito de vetores para ler e armazenar um conjunto de 50 
		//numeros inteiros. Encontrar e exibir o maior número.
		Scanner leia = new Scanner(System.in);
		
		int maiorNumero = 0, tamanhoVetor = 5;
		int numeros[] = new int[tamanhoVetor];
		
		for(int i = 0; i < tamanhoVetor; i++) {
			System.out.println("Digite um número: ");
			numeros[i] = leia.nextInt();
			if(numeros[i] > maiorNumero) {
				maiorNumero = numeros[i];
			}
		}
		
		System.out.println("O maior número é: " + maiorNumero);
		
		leia.close();
	}

}

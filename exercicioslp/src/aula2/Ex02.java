package aula2;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// crie um programa em java pra ler e armazenar 15 numeros inteiros em um vetor e montar 
		//outro vetor com os valores do primeiro multiplicados por 3
		
		Scanner leia = new Scanner(System.in);
		int tamanhoVetor = 15;
		int numeros[] = new int [tamanhoVetor];
		int numerosMultiplicados [] = new int [tamanhoVetor];
		
		for(int i =0; i < tamanhoVetor; i++) {
			System.out.println("Digite um número: ");
			 numeros[i] = leia.nextInt();
			 
			 numerosMultiplicados[i] = (numeros[i]* 3);
		}
		
		System.out.println("Números digitados: ");
		
		for(int i = 0; i< tamanhoVetor; i++) {
			System.out.println(numeros[i]);
		}
		
		System.out.println("Números multiplicados: ");
		
		for(int i = 0; i< tamanhoVetor; i++) {
			System.out.println(numerosMultiplicados[i]);
		}
		
		leia.close();
	}

}

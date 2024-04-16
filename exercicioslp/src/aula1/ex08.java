package aula1;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		// Criar um programa usando a estrutura while para ler 100 números inteiros e somar apenas os números pares. Ao final mostrar o total da soma.
	int num;
	int somaTotal = 0;
	int i = 0;
	
	Scanner leia = new Scanner(System.in);
	
	while(i < 5) {
		System.out.println("Digite um número: ");
		num = leia.nextInt();
		i++;
			if(num % 2 == 0) {
				somaTotal = somaTotal + num;
			}
	}
	
	System.out.println("O total é de: " + somaTotal);
	
	leia.close();
	
	
	}

}

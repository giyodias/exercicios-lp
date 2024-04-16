package aula1;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		//Crie um programa em java que tendo como dados de entrada a altura e o sexo de uma pessoa (1 - masculino e 2 - feminino), calcular seu peso ideal, utilizando as seguintes fórmulas:
		//Para masculino, pesoIdeal = (72.1*h) - 58
		//Para feminino, pesoIdeal = (62.1*h) - 44.7
		
		double altura, pesoIdeal;
		int sexo;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua altura:");
		altura = leia.nextDouble();
		
		System.out.println("Digite seu sexo (1- masculino e 2- feminino): ");
		sexo = leia.nextInt();
		
		if(sexo == 1) {
			pesoIdeal = (72.7 * altura) - 58;
			System.out.println("O seu peso ideal é: " + pesoIdeal);
		}
		else if(sexo == 2) {
			pesoIdeal = (62.1 * altura) - 44.7;
			System.out.println("O seu peso ideal é: " + pesoIdeal);
		}
		else {
			System.out.println("O valor informado não corresponde às opções disponíveis.");
		}
		
		
		leia.close();

	}

}

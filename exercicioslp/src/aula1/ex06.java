package aula1;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
	int numPc;
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite a quantidade de computadores gerenciados pela empresa: ");
	numPc = leia.nextInt();
	
	if(numPc % 2 == 0) {
		System.out.println("O número de computadores é par.");
	}
	
	else {
		System.out.println("O número de computadores é ímpar.");
	}
	
	leia.close();
	}

}

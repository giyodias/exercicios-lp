package aula1;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		double altura, largura, area;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite, em metros, quanto o terreno tem de altura:");
		altura = leia.nextDouble();
		
		System.out.println("Digite, em metros, quanto o terreno tem de largura:");
		largura = leia.nextDouble();
		
		area = (altura * largura);
		
		System.out.println("O terreno tem " + area + " metros quadrados.");
		
		leia.close();
	}

}

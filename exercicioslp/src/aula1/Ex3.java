package aula1;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		double custoFabrica, umPorCento, valorFinal;
		int percentagemImposto = 41;
		int percentagemDistribuidor = 32;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o custo de fábrica do veículo: ");
		custoFabrica = leia.nextDouble();
		
		umPorCento = (custoFabrica / 100);
		
		//valor final
		
		valorFinal = (custoFabrica + (umPorCento * percentagemImposto) + (umPorCento * percentagemDistribuidor));
		
		System.out.println("O valor final para o consumidor será de: " + valorFinal);
		
		leia.close();
		
	}

}

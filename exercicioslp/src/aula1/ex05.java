package aula1;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {

		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		if(idade < 16) {
			System.out.println("Você não pode votar.");
		}
		else if(idade >= 18 && idade <=64) {
			System.out.println("Seu voto é obrigatório.");
		}
		else if(idade >= 16 && idade < 18 || idade >= 65) {
			System.out.println("Seu voto é opcional.");
		}
		else {
			System.out.println("A idade inserida não é válida.");
		}
		
		leia.close();
	}

}

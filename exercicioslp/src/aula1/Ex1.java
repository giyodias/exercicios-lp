package aula1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int idadeAnos, idadeMeses, idadeDias, diasTotais;
		int diasNoMes = 30;
		int diasNoAno = 365;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade em anos:");	
		idadeAnos = leia.nextInt();
		
		System.out.println("Digite quantos meses de idade (que ainda não completaram um ano) você tem:");
		idadeMeses = leia.nextInt();
		
		System.out.println("Digite quantos dias de idade (que ainda não completaram um mês) que você tem:");
		idadeDias = leia.nextInt();
	
		
		diasTotais = (idadeAnos * diasNoAno) + (idadeMeses * diasNoMes) + idadeDias;
		
		System.out.println("Sua idade expressa em dias é: " + diasTotais);
		
		leia.close();
	}

}

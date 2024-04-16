package aula6;
import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float nota1, nota2;
		char letra;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite uma letra: ");
		letra = leia.next().charAt(0);
		
		float media = calcularMedia(nota1, nota2, letra);
		
		System.out.println("A media é: " + media);
		
		leia.close();
	}
	
	public static float calcularMedia(float nota1, float nota2, char letra) {
		float total = 0;
		float pesoNota1 = 0;
		float pesoNota2 = 0;
		
		if(letra =='A') {
			total = ((nota1 + nota2) / 2);
			return total;
		}
		else if(letra == 'P') {
			pesoNota1 = (nota1/100) * 70;
			
			pesoNota2 = (nota2/100) * 30;
			
			total = pesoNota1 + pesoNota2;
			
			return total;
		}
		
		return total;
		
		
		
	}

}

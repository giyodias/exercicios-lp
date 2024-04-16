package aula6;

public class Ex10 {

	public static void main(String[] args) {
		//
		
		double [] valores = new double[] {1,2,3,4,5};
		
		mostrarValores(valores);
		
		calcularMedia(valores);
		
		encontrarMaiorValor(valores);

	}
	
	public static void mostrarValores(double[] valores) {
		System.out.println("Os valores contidos no vetor são: ");
		for(int i = 0; i<valores.length; i++) {
			System.out.println(valores[i]);
		}
		
	}
	
	public static void calcularMedia(double[] valores) {
		double soma = 0;
		for(int i=0; i<valores.length; i++) {
			soma=soma + valores[i];
		}
		double media = soma / valores.length;
		
		System.out.println("A média dos valores no vetor é: " + media);
	}
	
	public static void encontrarMaiorValor(double[] valores) {
		double maiorValor = 0;
		
		for(int i =0; i<valores.length; i++) {
			if(valores[i] > maiorValor) {
				maiorValor = valores[i];
			}
		}
		
		System.out.println("o maior valor é: " + maiorValor);
	}
}

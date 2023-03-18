import java.util.Scanner;

public class questao2{
	
	public static void main(String[] args){
		
		Scanner ler_valor_lado_do_quadrado = new Scanner(System.in);
		float valor_lado_do_quadro;
		
		System.out.printf("Digite o valor do lado do quadrado: ");
		valor_lado_do_quadro = ler_valor_lado_do_quadrado.nextFloat();
		
		System.out.printf("Resultado: %.1fm^2", valor_lado_do_quadro*valor_lado_do_quadro);
		
	}	
	
}
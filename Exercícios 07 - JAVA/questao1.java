import java.util.Scanner;

public class questao1{

	public static void main(String[] args){
		
		float tamanho_da_base_do_retangulo, altura_do_retangulo, resultado;
		Scanner ler_valores_do_retangulo = new Scanner(System.in);		
		
		System.out.printf("Digite o valor da base do retangulo: ");
		tamanho_da_base_do_retangulo = ler_valores_do_retangulo.nextFloat();
		System.out.printf("Digite o valor da altura do retangulo: ");
		altura_do_retangulo = ler_valores_do_retangulo.nextFloat();
		
		resultado = tamanho_da_base_do_retangulo * altura_do_retangulo;
		System.out.printf("Resultado: %.1fm^2", resultado);
	
	}
}
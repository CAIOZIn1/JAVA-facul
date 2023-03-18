import java.util.Scanner;

public class questao5{
	
	public static void main(String[] args){
		
		Scanner ler_valor_celsius = new Scanner(System.in);
		float celsius, result;
		
		System.out.printf("Digite o valor em celsius: ");
		celsius = ler_valor_celsius.nextFloat();
		result = (celsius * 9/5) + 32;
		
		System.out.printf("Resultado: %.0f°f", result);
		
	}
	
}
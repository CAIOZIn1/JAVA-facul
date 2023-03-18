import java.util.Scanner;

public class questao4{
	
	public static void main(String[] args){
		
		Scanner ler_valor_digitao_ms = new Scanner(System.in);
		double valor_digitado_ms, result;
		
		System.out.printf("Digite o valor a ser convertido em m/s para km/h: ");
		valor_digitado_ms = ler_valor_digitao_ms.nextFloat();
		result =  valor_digitado_ms * 3.6;
		
		System.out.printf("Resultado: %.2fkm/h", result);
	}
	
}
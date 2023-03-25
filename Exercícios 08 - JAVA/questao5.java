import java.util.Scanner;

public class questao4{
	
	public static void main(String[] args){
		
		Scanner read_real_value = new Scanner(System.in);
		double amount_liters, result;
		
		System.out.print("Digite o valor em L: ");
		amount_liters = read_real_value.nextDouble();
		
		result = amount_liters / 3.78541 * 4 * 5.24;
		System.out.printf("Resultado: R$%.2f", result);
		
	}
}
import java.util.Scanner;

public class questao4{
	
	public static void main(String[] args){
		
		Scanner read_real_value = new Scanner(System.in);
		double real_value, dolar_value = 5.24;
		
		System.out.print("Digite um valor em dólar: U$");
		real_value = read_real_value.nextDouble();
		
		System.out.printf("Resultado: R$%.2f", real_value*dolar_value);
	}
	
}
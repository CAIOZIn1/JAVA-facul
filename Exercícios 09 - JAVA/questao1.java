import java.util.Scanner;

public class questao1{
	
	public static void main(String[] args){
		
		Scanner read_value_taxi = new Scanner(System.in);
		
		int km, time;
		double result;
		
		System.out.print("Digite o valor percorrido em km: ");
		km = read_value_taxi.nextInt();
		
		System.out.print("Digite o tempo transcorrido: ");
		time = read_value_taxi.nextInt();
		result = 2;
		
		if(km >= 1){
			
			result += km * 1.50;
			
		}
		
		if(time >= 2){

			int qtd_time = time / 2;
			result += qtd_time * .5;
			
		}
		
		System.out.printf("Resultado: R$%.2f", result);
		
	}
	
}
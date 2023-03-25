import java.util.Scanner;

public class questao1{
	
	public static void main(String[] args){
		
		Scanner read_km_value =  new Scanner(System.in);
		float km_value;
		
		System.out.print("Digite o valor em Km: ");		
		km_value = read_km_value.nextFloat();
		
		System.out.printf("Resultado: %.1fm/s", km_value*3.6);
	}
	
}
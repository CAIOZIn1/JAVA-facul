import java.util.Scanner;

public class exercicio02{
	public static void main(String[] args){
		Scanner read_values = new Scanner(System.in);
		int values, sum_values = 0;
		
		for(int i = 0; i < 10; i++){
			System.out.printf("Digite o valor %d: ", i+1);
			values = read_values.nextInt();	
			
			sum_values += values;
		}
		
		System.out.printf("Resultado: %d", sum_values);
	}
}
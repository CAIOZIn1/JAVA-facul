import java.util.Scanner;

public class questao5{
	
	public static void main(String[] args){
		
		Scanner read_values = new Scanner(System.in);
		int[] values = new int[2];
		
		for(int i = 0; i < 2; i++){
			System.out.printf("Digite o valor %d: ", i+1);
			values[i] = read_values.nextInt();
		}
		
		if(values[0] > values[1])
			System.out.printf("O maior valor digitado foi: %d", values[0]);
		else
			System.out.printf("O maior valor digitado foi: %d", values[1]);
		
	}
	
}
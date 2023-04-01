import java.util.Scanner;

public class questao6{
	
	public static void main(String[] args){
		
		Scanner read_values = new Scanner(System.in);
		int[] values =  new int[3];
		
		for(int i = 0; i < 3; i++){
			System.out.printf("Digite o valor %d: ", i+1);
			values[i] = read_values.nextInt();
		}
		
		if(values[0] > values[1] && values[0] > values[2])
			System.out.print("Decrescente.");
		else if(values[2] > values[0] && values[2] > values[1])
			System.out.print("Crescente.");
		else
			System.out.print("Desordenado.");
	}
	
}
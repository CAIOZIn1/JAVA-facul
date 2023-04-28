import java.util.Scanner;

public class exercicio07{
	public static void main(String[] args){
		Scanner read_value_for_triangle = new Scanner(System.in);
		int value_for_triangle;
		
		System.out.print("Digite um valor para o triângulo: ");
		value_for_triangle = read_value_for_triangle.nextInt();
		
		for(int i = 1; i <= value_for_triangle; i++){
			for(int j = 0; j < i; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}	
	}
}
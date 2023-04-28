import java.util.Scanner;

public class exercicio04{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int base, expoente, result;
		
		System.out.print("Digite o valor da base: ");
		base = scan.nextInt();
		
		System.out.print("Digite o valor do expoente: ");
		expoente = scan.nextInt();
		result = base;
		
		for(int i = 1; i < expoente; i++){
			result = result*base;
		}
		
		System.out.printf("Resultado: %d", result);
	}
}
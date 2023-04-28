import java.util.Scanner;

public class exercicio03{
	public static void main(String[] args){
		Scanner read_value_for = new Scanner(System.in);
		int value_for, soma = 0;
		
		System.out.print("Digite um valor maior que 0 para o for: ");
		value_for = read_value_for.nextInt();
		
		while(1 > value_for){
			System.out.print("Por favor, digite um valor maior que 0 para o for: ");
			value_for = read_value_for.nextInt();
		}
		
		for(int i = 0; i <= value_for; i++){
			soma += i;
		}
		
		System.out.printf("Resultado: %d", soma);
	}
}
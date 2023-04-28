import java.util.Scanner;

public class exercicio05{
	public static void main(String[] args){
		Scanner read_values = new Scanner(System.in);
		int enesimo_termo, razao, a = 0;
		
		System.out.print("Digite o valor do enesimo_termo: ");
		enesimo_termo = read_values.nextInt();
		
		System.out.print("Digite o valor da razao: ");
		razao = read_values.nextInt();
		
		for(int i = 0; i <= enesimo_termo; i++){
			System.out.printf("Posicao  %d: %d\n", i, a);
			a+= razao;
		}
	}
}
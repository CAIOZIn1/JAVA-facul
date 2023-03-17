import java.util.Scanner;

public class exercicio3{
	
	public static void main(String[] args){
	
		int valores_para_somar[] = new int[2];
		Scanner ler = new Scanner(System.in);
		
		for (int i = 0; i < 2; i++){
			valores_para_somar[i] = ler.nextInt();
		}
		
		int resultado = valores_para_somar[0] + valores_para_somar[1];
	
		System.out.printf("Sua soma é: %d",resultado);
	
	}
	
}
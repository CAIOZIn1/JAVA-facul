import java.util.Scanner;

public class questao3{
	
	public static void main(String[] args){
		
		Scanner ler_valores_lado_triangulo = new Scanner(System.in);
		
		//static final int qnd_lados_triangulo = 3;
		float valor_lado_triangulo[] = new float[4];
		float result = 0;
		
		for(int i = 1; i < 4; i++){		
			System.out.printf("Digite o valor do lado %d: ", i);
			valor_lado_triangulo[i] = ler_valores_lado_triangulo.nextFloat();
			result += valor_lado_triangulo[i];
		}

		//result = valor_lado_triangulo[1] + valor_lado_triangulo[2] + valor_lado_triangulo[3];
		System.out.printf("Resultado: %.1fm", result);
	}
	
}
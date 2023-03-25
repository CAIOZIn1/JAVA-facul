import java.util.Scanner;

public class questao3{
	
	public static void main(String[] args){
		
		Scanner read_values_name = new Scanner(System.in);
		String[] full_name = new String[3];
		
		for(int i = 0; i < 3; i++){
			
			System.out.printf("Digite o seu %d° nome: ", i+1);
			full_name[i] = read_values_name.next();
			
		}
		
		System.out.printf("Resultado nome completo: %s %s %s.", full_name[0], full_name[1], full_name[2]);
		
	}
	
}
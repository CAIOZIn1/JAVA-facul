import java.util.Scanner;

public class questao3{
	
	public static void main(String[] args){
		Scanner read_values_system =  new Scanner(System.in);
		int age, contribuition_time, sex;
		
		System.out.print("Digite o seu sexo (1- para masculino, 2- para feminino): ");
		sex = read_values_system.nextInt();
		
		if (sex < 1 || sex > 2){
			System.out.print("Digite um valor valido para o sexo.");
			return;
		}
			
		System.out.print("Digite a sua idade em anos: ");
		age = read_values_system.nextInt();
		
		System.out.print("Digite o seu tempo de contribuicao em anos: ");
		contribuition_time = read_values_system.nextInt();
		contribuition_time += age;
		
		if(sex == 1){
			if (contribuition_time >= 95){
				System.out.print("Você esta aposentadao");
				return;
			}
			
			System.out.printf("Não esta aposentado. Tempo total: %d, tempo restante: %d", contribuition_time, 95 - contribuition_time);
			return;
		}
			
		if (contribuition_time >= 85){
			System.out.print("Você esta aposentada");
			return;
		}
			
		System.out.printf("Não esta aposentada. Tempo total: %d, tempo restante: %d", contribuition_time, 85 - contribuition_time);
		return;
	}
	
}
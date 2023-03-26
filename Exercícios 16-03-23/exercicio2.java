import java.util.Scanner;

public class exercicio1{

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		String nome;
		int idade;
		double massa;
		
		System.out.printf("Digite o seu nome:");
		nome = scan.nextLine();
		
		System.out.printf("Digite o sua idade:");
		idade = scan.nextInt();
		
		System.out.printf("Digite a sua massa:");
		massa = scan.nextDouble();
		
		System.out.printf("Seu nome é: %s\nSua idade é: %d\nSua masssa é %.2f",
		nome, idade, massa );
	}
}
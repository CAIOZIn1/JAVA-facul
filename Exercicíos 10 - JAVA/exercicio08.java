import java.util.Scanner;

public class exercicio08{
	public static void main(String[] args){
		Scanner readFriendNums = new Scanner(System.in);
		int num1, num2, result_num1 = 0, result_num2 = 0;
		
		System.out.print("Digite o primeiro valor: ");
		num1 = readFriendNums.nextInt();
		System.out.print("Digite o segundo valor: ");
		num2 = readFriendNums.nextInt();
		
		for(int i = 1; i < num1; i++){
			if(num1 % i == 0){
				result_num1 += i;
			}
		}
		
		for(int i = 1; i < num2; i++){
			if(num2 % i == 0){
				result_num2 += i;
			}
		}
		
		if(result_num1 == num2 && result_num2 == num1){
			System.out.printf("Os numeros %d e %d sao amigos", num1, num2);
			return;
		}
		System.out.printf("Os numeros %d e %d nao sao amigos", num1, num2);
	}
}
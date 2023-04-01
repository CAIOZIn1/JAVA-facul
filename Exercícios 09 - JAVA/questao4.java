import java.util.Scanner;

public class questao4{
	
	static void printMonth(String month, int days){
		System.out.printf("%s -> %d dias.",month, days);
	}
	
	public static void main(String[] args){
		
		Scanner read_value_month = new Scanner(System.in);
		String month_value;
		boolean check_value_31_days, check_value_30_days;
		
		System.out.print("Digite o numero do mes(digite os valores em letra minuscula, sem 'ç'): ");
		month_value =  read_value_month.next();
		
		check_value_31_days = month_value.equals("janeiro") || month_value.equals("marco") || month_value.equals("maio") 
		|| month_value.equals("julho") || month_value.equals("agosto") || month_value.equals("outubro") || month_value.equals("dezembro");
		check_value_30_days = month_value.equals("abril") || month_value.equals("junho") || month_value.equals("setembro") || month_value.equals("novembro");
		
		if (check_value_31_days)
			printMonth(month_value, 31);
		else if (month_value.equals("fevereiro"))
			printMonth(month_value, 28);
		else if (check_value_30_days)
			printMonth(month_value, 30);
		else
			System.out.print("Digite um valor valido.");
	}
	
}
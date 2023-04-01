import java.util.Scanner;

public class questao2{
	
	public static void main(String[] args){
		
		Scanner read_value_age_and_price =  new Scanner(System.in);
		int idade;
		double valor_compra, result_descont, descont;
		
		System.out.print("Digite o valor da sua compra: R$");
		valor_compra = read_value_age_and_price.nextDouble();
		
		System.out.print("Digite o valor da sua idade: ");
		idade = read_value_age_and_price.nextInt();
		
		if( idade < 18){
			
			result_descont = valor_compra * .9;
			descont = valor_compra - result_descont;
			
		} else if( idade >= 18 && idade <= 60){
			
			result_descont = valor_compra * .95;
			descont = valor_compra - result_descont;
			
		} else{
			
			result_descont = valor_compra * .85;
			descont = valor_compra - result_descont;
			
		}
		
		System.out.printf("Resultado com desconto: R$%.2f, valor do desconto: R$%.2f", result_descont, descont);
		
	}
	
}
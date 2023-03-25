import java.util.Scanner;

public class questao2{
	
	public static void main(String[] args){
		
		Scanner read_values_of_cylinder = new Scanner(System.in);
		double value_ray, value_hight, result;
		
		System.out.print("Valor do raio: ");
		value_ray = read_values_of_cylinder.nextDouble();
		System.out.print("Valor da altura: ");
		value_hight = read_values_of_cylinder.nextDouble();
		
		result = 2*3.14*value_ray*(value_ray + value_hight);
		System.out.printf("Resultado: %.2fm^2", result);
		
	}
	
}
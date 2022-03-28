import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int id, hora;
		double valor, salario;
		
		System.out.println("Insira ID:");
		id= sc.nextInt();
		
		System.out.println("Insira horas trabalhadas:");
		hora= sc.nextInt();
		
		System.out.println("Insira valor da hora trabalhada:");
		valor= sc.nextDouble();
		
		salario = hora * valor;
		
		System.out.println("NUMBER: " + id);
		System.out.printf("SALARY = U$ %.2f%n",salario);		
		
		sc.close();
	}
}

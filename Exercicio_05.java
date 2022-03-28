import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codP01, numP01, codP02, numP02;
		double valP01, valP02, total;
		
		System.out.println("Insira Codigo, quantidade e valor da peça:");
		codP01= sc.nextInt();
		numP01= sc.nextInt();
		valP01= sc.nextDouble();
				
		System.out.println("Insira Codigo, quantidade e valor da peça:");
		codP02= sc.nextInt();
		numP02= sc.nextInt();
		valP02= sc.nextDouble();
		
		total = (numP01 * valP01) + (numP02 * valP02);
		
		System.out.printf("VALOR A PAGAR: R$%.2f%n", total);
		
		sc.close();
	}

}

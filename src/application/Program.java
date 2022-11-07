package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
				
		System.out.println("Entre com os dados do contrato");
		System.out.println("------------------------------");
		
		System.out.print("Número: ");
		
		System.out.print("Data (dd/MM/yyyy HH:mm): ");
		
		System.out.print("Entre com o número de parcelas: ");

		
		sc.close();
	}
}
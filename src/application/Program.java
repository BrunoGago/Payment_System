package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;

public class Program {

	public static void main(String[] args){
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato");
		System.out.println("------------------------------");
		
		System.out.print("Número: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy HH:mm): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Entre com o número de parcelas: ");
		double totalValue = sc.nextDouble();
		
		Contract contract = new Contract(number, date, totalValue);

		
		sc.close();
	}
}
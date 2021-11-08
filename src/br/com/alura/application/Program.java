package br.com.alura.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.alura.entities.Product;

public class Program {

	public static void main(final String[] args) {

		Locale.setDefault(Locale.US);

		final Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();

		final Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			final String name = sc.nextLine();
			final double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}

		double sum = 0.0;
		for(int i=0; i< vect.length; i++) {
			sum += vect[i].getPrice();
		}

		final double avg = sum / vect.length;

		System.out.printf("Average Hight: %.2f%n", avg);

		sc.close();
	}

}

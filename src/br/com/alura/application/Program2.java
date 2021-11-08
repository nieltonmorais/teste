package br.com.alura.application;

import java.util.Scanner;

import br.com.alura.entities.Rent;

public class Program2 {

	public static void main(final String[] args) {

		final Scanner sc = new Scanner(System.in);

		final Rent[] vect = new Rent[10];

		System.out.println("How many rooms will be rented? ");
		final int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			final String name = sc.nextLine();
			System.out.print("Email: ");
			final String email = sc.nextLine();
			System.out.print("Room: ");
			final int room = sc.nextInt();
			vect[room] = new Rent(name, email);
		}

		System.out.println();
		System.out.println("Busy rooms: ");
		for(int i = 0; i < 10; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i].toString());
			}
		}

		sc.close();
	}

}

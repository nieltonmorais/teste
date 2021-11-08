package br.com.alura.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.alura.entities.Employee;

public class Program4 {

	public static boolean hasId(final List<Employee> list, final int id) {
		final Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

	public static void main(final String[] args) {

		Locale.setDefault(Locale.US);
		final Scanner sc = new Scanner(System.in);

		final List<Employee> list = new ArrayList<>();

		// PART 1 - READING DATA:

		System.out.print("How many employees will be registered? ");
		final int n = sc.nextInt();

		for(int i=0; i<n; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.println("Id: ");
			final Integer id = sc.nextInt();

			while(hasId(list, id)) {
				System.out.println("Id already taken! Try again: ");
				sc.nextInt();
			}

			System.out.println("Name: ");
			sc.nextLine();
			final String name = sc.nextLine();
			System.out.println("Salary: ");
			final Double salary = sc.nextDouble();

			final Employee emp = new Employee(id, name, salary);
			list.add(emp);
		}

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		final int idsalary = sc.nextInt();

		final Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);

		//final Integer pos = position(list, idsalary);

		if(emp == null) {
			System.out.println("This Id does not exist");
		}else {
			System.out.print("Enter the percentage: ");
			final double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}

		System.out.println();
		System.out.println("List of employee:");

		for(final Employee x : list) {
			System.out.println(x);
		}


		sc.close();

	}

	public static Integer position(final List<Employee> list, final int id) {
		for(int i=0; i<list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}

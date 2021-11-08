package br.com.alura.entities;

public class Employee {

	public int id;
	public String name;
	public double salary;

	public Employee(final int id, final String name, final double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void increaseSalary(final double percentage) {
		salary += salary * percentage / 100.0;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public void setSalary(final double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}



}

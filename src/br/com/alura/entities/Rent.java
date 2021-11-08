package br.com.alura.entities;

public class Rent {

	public String name;
	public String email;

	public Rent(final String name, final String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public void setName(final String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name + ", " + email;
	}

}

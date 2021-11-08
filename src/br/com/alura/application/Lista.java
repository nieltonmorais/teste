package br.com.alura.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(final String[] args) {

		final List<Integer> inteiros = new ArrayList<>();
		final List<String> list = new ArrayList<>();

		inteiros.add(0);
		inteiros.add(1);
		inteiros.add(2);
		inteiros.add(3);
		inteiros.add(4);

		//System.out.println(inteiros);

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");

		System.out.println("Tamanho da Lista: " + list.size());

		for(final String a : list) {
			System.out.println(a);
		}

		System.out.println("------------------------------------");

		list.remove("Anna");

		for(final String a : list) {
			System.out.println(a);
		}

		System.out.println("------------------------------------");

		list.removeIf(x -> x.charAt(0) == 'M');
		list.add("Nielton");
		list.add("Marianny");

		for(final String a : list) {
			System.out.println(a);
		}

		System.out.println("------------------------------------");

		System.out.println("Index Of Bob: " + list.indexOf("Bob"));
		System.out.println("Index Of Marianny: " + list.indexOf("Marianny"));

		System.out.println();

		list.add("Andre");
		list.add("Angela");

		for(final String a : list) {
			System.out.println(a);
		}

		System.out.println("------------------------------------");

		final List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		for(final String a : result) {
			System.out.println(a);
		}

		list.add("Nielton");
		list.add("Marianny");

		for(final String a : list) {
			System.out.println(a);
		}

		System.out.println("------------------------------------");
		System.out.println();

		final String nome = list.stream().filter(a -> a.charAt(0) == 'B').findFirst().orElse(null);

		System.out.println(nome);










	}

}

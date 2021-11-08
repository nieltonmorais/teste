package br.com.alura.application;

import java.util.Scanner;

public class Matrix {

	public static void main(final String[] args) {

		final Scanner sc = new Scanner(System.in);

		int n1, n2;
		n1 = sc.nextInt();
		n2 = sc.nextInt();

		final int[][] mat = new int[n1][n2];

		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
		}

		System.out.println();
		System.out.println("Enter with int 'X': ");
		final int x = sc.nextInt();

		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if(x == mat[i][j]) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}






		sc.close();
	}

}

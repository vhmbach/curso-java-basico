package com.vitorbach.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro: ");
		int num1 = scan.nextInt();
		System.out.println("Digite outro n�mero inteiro: ");
		int num2 = scan.nextInt();
		int media = num1 + num2;
		System.out.println("A soma dos n�meros informados �: " + media);
		
	}

}

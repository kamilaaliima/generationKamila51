package geneFamilia51;

import java.util.Scanner;

/*  4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
 */

public class exeImparPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

double a,b,c,d;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro número: ");
		a = leia.nextDouble();
		System.out.println("\nEntre com o segundo número: ");
		b = leia.nextDouble();
		System.out.println("\nEntre com o terceiro número: ");
		c = leia.nextDouble();
		
		// d = (r+s)/2  r = (a+b)ao quadrado s = (b+c) ao quadrado
		d = (Math.pow((a+b),2) + Math.pow((b+c),2)) / 2;
		System.out.println("\nO valor de D é: "+d);

	}

}

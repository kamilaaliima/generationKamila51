package geneFamilia51;

import java.util.Scanner;

/*  4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
 */

public class exeImparPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		double res;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o valor do número: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0)
		{
			res = Math.sqrt(numero);
		}
		else
		{
			res = Math.pow(numero,2);
		}
		
		System.out.println("\nResultado: "+res);


	}

}

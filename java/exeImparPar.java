package geneFamilia51;

import java.util.Scanner;

/*  4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.
 */

public class exeImparPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

double a,b,c,d;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro n�mero: ");
		a = leia.nextDouble();
		System.out.println("\nEntre com o segundo n�mero: ");
		b = leia.nextDouble();
		System.out.println("\nEntre com o terceiro n�mero: ");
		c = leia.nextDouble();
		
		// d = (r+s)/2  r = (a+b)ao quadrado s = (b+c) ao quadrado
		d = (Math.pow((a+b),2) + Math.pow((b+c),2)) / 2;
		System.out.println("\nO valor de D �: "+d);

	}

}

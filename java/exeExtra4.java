package geneFamilia51;

import java.util.Scanner;
/*4. Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
* calcule a seguinte express�o: d = r+s/2 onde r = (a+b)2 es= (b+c)2
*/
public class exeExtra4 {

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

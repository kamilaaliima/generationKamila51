package exeJavaGen;

import java.util.Scanner;

public class exemploArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float[] media = new float[3];  //array unidimensional -  array[] c tipo de dado float
		float n1,n2,n3,mg,somaMedia=0;   //pode criar tudo junto tbm
		int x;

		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<3;x++) {
			
			System.out.println("\nEntre com o N1: ");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com o N2: ");
			n2 = leia.nextFloat();
			System.out.println("\nEntre com o N3: ");
			n3 = leia.nextFloat();
			media[x] = (n1+n2+n3)/3;
			System.out.printf("\nMédia aritimética do alune %d foi de: %2.2f",x+1,media[x]); // printf(%d e %2.2f é caracteristica dele, principalmente pra arredondamento ) 
			somaMedia += media[x];
		}
		mg = somaMedia /3;
		System.out.printf("\nMédia geral da turma: 2%.2f",mg);
	}

}

package geneFamilia51;

// 1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

import java.util.Scanner;

public class exe3Inteiros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int number1,number2,number3,maior=0;
		
		
		System.out.println("\nEscreva o primeiro n�mero: ");
		number1 = leia.nextInt();
		System.out.println("\nEscreva o segundo n�mero: ");
		number2 = leia.nextInt();
		System.out.println("\nEscreva o terceiro n�mero: ");
		number3 = leia.nextInt();
		
		
	       if ((number1 > number2) && (number1 > number3)) {
	    	   maior = number1;
	    	 }else if ((number2 > number1) && (number2>number3)) {
	    	   maior = number2;
	    	 }else {
	    		 maior = number3;
	    	 }
	       
	
	    	   System.out.printf("O n�mero maior �: " + maior);
			
		}
		
	}



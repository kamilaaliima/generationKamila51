package geneFamilia51;

//2- Faça um programa que entre com três números e coloque em ordem crescente.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class exeNumCrescente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int number1,number2,number3=0;	
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("\nEscreva o primeiro número: ");
		number1 = leia.nextInt();
		System.out.println("\nEscreva o segundo número: ");
		number2 = leia.nextInt();
		System.out.println("\nEscreva o terceiro número: ");
		number3 = leia.nextInt();
		
				
		int[] number = {number1, number2, number3};
		
				
		System.out.println("-------Números em ordem crescente----------");
		
		Arrays.sort(number);
		
		for(int i=0; i<number.length; i++) {
			System.out.println(number[i]);
			
		}
			
				

	}

}

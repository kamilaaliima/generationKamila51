package geneFamilia51;

//2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class exeNumCrescente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int number1,number2,number3=0;	
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("\nEscreva o primeiro n�mero: ");
		number1 = leia.nextInt();
		System.out.println("\nEscreva o segundo n�mero: ");
		number2 = leia.nextInt();
		System.out.println("\nEscreva o terceiro n�mero: ");
		number3 = leia.nextInt();
		
				
		int[] number = {number1, number2, number3};
		
				
		System.out.println("-------N�meros em ordem crescente----------");
		
		Arrays.sort(number);
		
		for(int i=0; i<number.length; i++) {
			System.out.println(number[i]);
			
		}
			
				

	}

}

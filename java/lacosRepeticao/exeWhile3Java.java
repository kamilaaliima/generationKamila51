package exeJavaGen;

import java.util.Scanner;

/*
 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.
 */
public class exeWhile3Java {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade, contMenor21 = 0, contMaior50 = 0, pessoas=0;
		
		while(pessoas<=5) {
		System.out.printf("\nDigite a sua idade: ");
		idade = entrada.nextInt();
		
		while(idade <= 99) {
			
			if(idade> 0 && idade <= 21) {
				contMenor21++;
				System.out.println("\nDigite a sua idade: ");
				idade = entrada.nextInt();
						
			}else if(idade >= 50) { 
				contMaior50++;
				System.out.printf("\nDigite a sua idade: ");
				idade = entrada.nextInt();
			}
			
			else{
				pessoas++;
				System.out.printf("\nDigite a sua idade: ");
				idade = entrada.nextInt();
			}
				
			System.out.printf("\nTotal de pessoas com menos de 21 anos: "+contMenor21);
			System.out.printf("\nTotal de pessoas com mais de 50 anos: "+contMaior50);
			
		}	
		
			
		}
		
		pessoas++;
			
	}

}

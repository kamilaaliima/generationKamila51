package exeJavaGen;

import java.util.Scanner;

public class exeDoWhile6Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero, somaMult3=0, quant=0;
		float media;
		Scanner leia = new Scanner(System.in);
		
		do
		{
			System.out.println("\nentre com um n�mero: ");
			numero = leia.nextInt();
			if(numero==0)
			{
				System.out.println("\nVoc� digitou zero, vamos finalizar o sistema!!!");
			}
			else
			{
				if(numero%3==0)
				{
					quant +=numero;
					quant++;
				}
			}
		}
		while(numero!=0);
		media = somaMult3 / quant;
		System.out.printf("\nM�dia dos n�meros m�ltiplos de 3: %6.2f",media);
			

		
	}

}

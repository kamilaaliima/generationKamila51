package exeJavaGen;
/*
 4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante deve ser lido 
e o resultado da adição da constante deve ser armazenado na própria matriz.
 */

import java.util.Scanner;

public class exeArray4java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float[][] matriz1 = new float[2][2];
		float[][] matriz2 = new float[2][2];
		float[][] matriz3 = new float[2][2];
		int i,j,op;
		float numero;
		Scanner leia = new Scanner(System.in);
		
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.println("\nEntre com o valor da Matriz1: ");
				matriz1[i][j] = leia.nextFloat();
				System.out.println("\nEntre com o valor da Matriz2: ");
				matriz2[i][j] = leia.nextFloat();
			}
		}
		
		do
		{
			System.out.println("\n\t\tMenu de opções");
			System.out.println("\n1-Somar as duas matrizes.");
			System.out.println("\n2-Subtrair a primeira matriz da segunda.");
			System.out.println("\n3-Adicionar uma constante as duas matrizes.");
			System.out.println("\n4-Imprimir as matrizes.");
			System.out.println("\n0-Sair do programa!!!.");
			System.out.println("\nDigite sua opção: ");
			op = leia.nextInt(); //8 0
			switch(op)
			{
			case 1:
				for(i=0;i<2;i++)
				{
					for(j=0;j<2;j++)
					{
						matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
						System.out.println("\nSoma das matrizes: "+matriz3[i][j]);
					}
				}
				break;
			case 2:
				for(i=0;i<2;i++)
				{
					for(j=0;j<2;j++)
					{
						matriz3[i][j] = matriz2[i][j] - matriz1[i][j];
						System.out.println("\nSubtração das matrizes: "+matriz3[i][j]);
					}
				}
				break;
			case 3:
				System.out.println("\nEntre com o valor da constante: ");
				numero = leia.nextFloat();
				for(i=0;i<2;i++)
				{
					for(j=0;j<2;j++)
					{
						matriz1[i][j] += numero;
						matriz2[i][j] += numero;
						System.out.println("\nMatriz1: "+matriz1[i][j]);
						System.out.println("\nMatriz2: "+matriz2[i][j]);
					}
				}
				break;
			case 4:
				for(i=0;i<2;i++)
				{
					for(j=0;j<2;j++)
					{
						
						System.out.println("\nMatriz1: "+matriz1[i][j]);
						System.out.println("\nMatriz2: "+matriz2[i][j]);
					}
				}
				break;
				default:
					if(op<0 || op>4)
					{
						System.out.println("\nOpção inválida!!!");
					}
					else if(op==0)
					{
					System.out.println("\nObrigado por usar o nosso software...");
					}
					else
					{
						System.out.println("\nVamos utilizar novamente o nosso sistema...");
					}
			}
			
			
		}
		while(op!=0);
		
	}

}


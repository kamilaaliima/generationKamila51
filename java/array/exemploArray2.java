package exeJavaGen;

import java.util.Scanner;

public class exemploArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] numeros = new int[2][3];
		int somaNumeros=0, linha, coluna;
		float mediaNumeros;
		Scanner leia = new Scanner(System.in);
		
		for(linha=0; linha<2;linha++); {
			
			for(coluna=0;coluna<3;coluna++) {
				
				System.out.println("\nEntre com um número: ");
				numeros[linha][coluna] = leia.nextInt();
				somaNumeros += numeros[linha][coluna];  //se não souber o tamanho cria um cont 
			}
		}
		mediaNumeros = somaNumeros / 6;
		System.out.printf("\nMédia dos números lidos foi de: 5%.2",mediaNumeros);
		
	}

}

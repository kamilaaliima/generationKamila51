package exeJavaGen;
//2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
import java.util.Scanner;

public class exeFor2Java {

	public static void main(String[] args) {
		
		int num,quantPar=0,quantImpar=0,x;
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=10;x++){
			
			System.out.println("\nInsira o n�mero: ");
			num = leia.nextInt();
			
			if(num %2 == 0){
				
				quantPar++;
			}else{
				
				quantImpar++;
			}
		}
		System.out.println("\nQuantidade de n�meros pares: "+quantPar);
		System.out.println("\nQuantidade de n�meros �mpares: "+quantImpar);
		
		
	}

}

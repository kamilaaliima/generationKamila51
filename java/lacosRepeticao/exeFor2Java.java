package exeJavaGen;
//2- Ler 10 números e imprimir quantos são pares e quantos são ímpares.
import java.util.Scanner;

public class exeFor2Java {

	public static void main(String[] args) {
		
		int num,quantPar=0,quantImpar=0,x;
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=10;x++){
			
			System.out.println("\nInsira o número: ");
			num = leia.nextInt();
			
			if(num %2 == 0){
				
				quantPar++;
			}else{
				
				quantImpar++;
			}
		}
		System.out.println("\nQuantidade de números pares: "+quantPar);
		System.out.println("\nQuantidade de números ímpares: "+quantImpar);
		
		
	}

}

package polimorfismo;

import java.util.Scanner; 

public class TesteAnimal {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Cachorro cachorro = new Cachorro();
		
		cachorro.imprimirInfo();
		
		Cavalo cavalo = new Cavalo();
		
		Preguica preguica = new Preguica();
		
		Animal animal = null;
		
		int x = 0;
		do {
			System.out.println("\nEscolha um animal:\n\n1- Cachorro\n2- Cavalo\n"+"3- Preguiça\n");
			x= leia.nextInt();
			
			if(x==1) {
				animal = cachorro;
				
		
				System.out.println("\nQual a idade do seu cachorro? ");
				int idade = leia.nextInt();
				leia.nextLine();
				
				System.out.println("\nQual o nome do seu cachorro? ");
				String nome = leia.nextLine();
				leia.nextLine();
				
				System.out.println("\nQual o som que ele emite? ");
				String som = leia.nextLine();
				leia.nextLine();
				
				
				
			System.out.println("---------------------------------------------");
				
				cachorro.nome(nome);
				cachorro.idade(idade);
				cachorro.som(som);
			}
			
			else if(x==2) {
				
				animal = cavalo;
				
				System.out.println("\nQual a idade do seu cavalo? ");
				int idade = leia.nextInt();
				leia.nextLine();
				
				System.out.println("\nQual o nome do seu cavalo? ");
				String nome = leia.nextLine();
				leia.nextLine();
				
				System.out.println("\nQual o som que ele emite? ");
				String som = leia.nextLine();
				leia.nextLine();
				
			System.out.println("---------------------------------------------");
				
				cavalo.nome(nome);
				cavalo.idade(idade);
				cavalo.som(som);
				
			}
			
			else if(x==3) {
				
				animal = preguica;
				
				System.out.println("\nQual a idade da preguiça? ");
				int idade = leia.nextInt();
				leia.nextLine();
				
				System.out.println("\nQual o nome da preguiça? ");
				String nome = leia.nextLine();
				leia.nextLine();
				
				System.out.println("\nQual o som que ela emite? ");
				String som = leia.nextLine();
				leia.nextLine();
				
			System.out.println("------------------------------------------------");
				
				preguica.nome(nome);
				preguica.idade(idade);
				preguica.som(som);
			}
			
			else {
				System.out.println("\nOpção inválida!");
			}
		}
			while(x<=0 || x>=4);
			
		}
}

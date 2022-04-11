package polimorfismo;


import java.util.ArrayList;
import java.util.Scanner;

public class Collections2 {

	public static void main(String[] args) {
		
		int op;
		Scanner leia = new Scanner(System.in);
		
	ArrayList<String> estoque = new ArrayList();
	
	do {
		System.out.println("\n--------------FARMÁCIA LITORAL------------------");
	
		System.out.println("\n(1) Adicionar itens ao estoque.");
		System.out.println("\n(2) Remover itens do estoque.");
		System.out.println("\n(3) Atualizar estoque.");
		System.out.println("\n(4) Exibir itens do estoque.");
		System.out.println("\n(0) Encerrar o programa!");
		
		System.out.println("\n******************************************");
	
		System.out.println("\nDigite uma opção: ");
		
	
	op = leia.nextInt();
	
	switch(op) {
	case 1: 
		leia.nextLine();
		System.out.println("\nDigite o produto que deseja adicionar ao estoque: ");
		String produto = leia.nextLine();
		estoque.add(produto);
		break;
	case 2:
		leia.nextLine();
		System.out.println("\nDigite o produto que deseja remover do estoque: ");
		String produtor = leia.nextLine();
		
		if(estoque.contains(produtor)) {
			estoque.remove(produtor);
			}
		else {
			System.out.println("\nItem não exite!");
		}
			System.out.println(estoque);
			break;
			
		case 3: 
				leia.nextLine();
				System.out.println("\nDigite o item que quer atualizar: ");
				String verifica = leia.nextLine();
			System.out.println("\nDigite qual item vai substituir "+verifica+" : ");
			String novo = leia.nextLine();
			
			if(estoque.contains(verifica)) {
				estoque.remove(verifica);
				estoque.add(novo);
			}
			else {
				System.out.println("\nProduto não consta!");
			}
			System.out.println(estoque);
			break;

		case 4: 
			System.out.println("\nOs itens em estoque são: ");
			System.out.println(estoque);
			break;
		default: 
			if(op<0 || op>4) {
				System.out.println("\nOpção inválida... Digite uma nova opção!");
			}
			else {
				System.out.println("\nFinalizou o programa!");
			}
			
		}
	
	}
	while(op != 0);
	
	
	}
}

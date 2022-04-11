package polimorfismo;
/* 3- Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Collections;


public class Collections {

	public static void main(String[] args) {
		
		List<Integer> minhaLista = new ArrayList<Integer>();
		
		minhaLista.add(2); // add um elemento ao meu arrayList
		minhaLista.add(5);
		minhaLista.add(2);
		minhaLista.add(1);
		minhaLista.add(6);
		minhaLista.add(1);
		minhaLista.add(3);
		
		for(Integer listaElementos:minhaLista) {
			System.out.println(listaElementos);
		}
		System.out.println("\nRemovendo um elemento da minha lista!");
		
		System.out.println();
		minhaLista.remove(0);
		
		for(Integer listaElementos:minhaLista) {
			System.out.println(listaElementos);
		}
		
		int primeiroElemento = minhaLista.get(0);
			System.out.println("\nO primeiro elemento da minha lista é: " +primeiroElemento);
		
		for(int i =0; i<minhaLista.size(); i++) {
			System.out.println("\nElemento: " +minhaLista.get(i));
			}
		
		Collections.sort(minhaLista);
			System.out.println("\nDepois de ordenado fica assim...");
			System.out.println(minhaLista);
			
			System.out.println();
			
		Set<Integer> meuSet = new HashSet<Integer>();
		
			meuSet.add(3);
			meuSet.add(8);
			meuSet.add(1);
			meuSet.add(3);
			meuSet.add(2);
			meuSet.add(8);
		
		Interator<Integer> iMeuSet = meuSet.iterator();
		
		while(iMeuSet.hasNext()) {
			
			System.out.println(iMeuSet.next());
		}
	}
}

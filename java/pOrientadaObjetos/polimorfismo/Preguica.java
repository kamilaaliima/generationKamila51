package polimorfismo;

public class Preguica extends Animal {
	
	public Preguica() {
		super("Animal: Preguiça");
	}
	
	@Override
	public void nome(String nome) {
		System.out.print("\nO nome da preguiça é: " +nome);
	}
	
	@Override
	public void idade(int idade) {
		System.out.print("\nA idade da preguiça é: " +idade);
	}
	
	@Override
	public void som(String som) {
		System.out.print("\nSom emitido pelas preguiças: " +som);
	}
	public void subirArvore() {
		System.out.println("Sim, elas amam escalar e se pendurar nas árvores!");
	}
	
	
}

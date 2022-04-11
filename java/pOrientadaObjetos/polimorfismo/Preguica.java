package polimorfismo;

public class Preguica extends Animal {
	
	public Preguica() {
		super("Animal: Pregui�a");
	}
	
	@Override
	public void nome(String nome) {
		System.out.print("\nO nome da pregui�a �: " +nome);
	}
	
	@Override
	public void idade(int idade) {
		System.out.print("\nA idade da pregui�a �: " +idade);
	}
	
	@Override
	public void som(String som) {
		System.out.print("\nSom emitido pelas pregui�as: " +som);
	}
	public void subirArvore() {
		System.out.println("Sim, elas amam escalar e se pendurar nas �rvores!");
	}
	
	
}

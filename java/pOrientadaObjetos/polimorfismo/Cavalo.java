package polimorfismo;

public class Cavalo extends Animal {
	
	public Cavalo() {
		super("Animal: Cavalo");
	}
	
	@Override
	public void nome(String nome) {
		System.out.print("\nO nome do cavalo é: " +nome);
	}
	
	@Override
	public void idade(int idade) {
		System.out.print("\nA idade do cavalo é: " +idade);
	}
	
	@Override
	public void som(String som) {
		System.out.print("\nSom emitido pelos cavalos: " +som);
	}
	public void correr() {
		System.out.println("Sim, os cavalos correm!");
	}
	
	
}

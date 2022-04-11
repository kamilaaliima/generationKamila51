package polimorfismo;

public class Cachorro extends Animal {

	public Cachorro() {
		super("Animal: Cachorro");
	}
	
	@Override
	public void nome(String nome) {
		System.out.print("\nO nome do cachorro é: " +nome);
	}
	
	@Override
	public void idade(int idade) {
		System.out.print("\nA idade do cachorro é: " +idade);
	}
	
	@Override
	public void som(String som) {
		System.out.print("\nSom emitido pelos cachorros: " +som);
	}
	public void correr() {
		System.out.println("Sim, os cachorros correm!");
	}
	

}

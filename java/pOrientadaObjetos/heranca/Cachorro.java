package heranca;

public class Cachorro extends Animal {
	
	public void correr() {
		System.out.println("\nEste animal corre!");
	}

	public Cachorro() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Cachorro shitsu = new Cachorro();
		shitsu.setNome("Anitta");
		shitsu.setIdade(2);
		shitsu.somEmitido("Latido (Au-au)");
	}

}

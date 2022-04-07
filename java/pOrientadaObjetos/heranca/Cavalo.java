package heranca;

public class Cavalo extends Animal {
	
	public void correr() {
		System.out.println("\nEste animal corre!");
	}
	
	
	public Cavalo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cavalo frisio = new Cavalo();
		frisio.setNome("Zeca");
		frisio.setIdade(5);
		frisio.somEmitido("relincha (hinn in in)");

	}

}

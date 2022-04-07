package heranca;

public class Preguica extends Animal{

	public void subirArvore() {
		System.out.println("Siiim, apesar de preguiçosa se pinduram entre os galhos das árvores!");
	}
	public Preguica() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Preguica nani = new Preguica();
		nani.setNome("Nani");
		nani.setIdade(32);
		nani.somEmitido("rooweer");
		nani.subirArvore();
		
		
		
	}

}

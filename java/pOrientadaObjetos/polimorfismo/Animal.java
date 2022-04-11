package polimorfismo;

public abstract class Animal {

	private String tipoSAnimal; 
	public Animal(String tipoAnimal) {
		this.tipoSAnimal = tipoAnimal;
	}
	
	abstract public void nome(String nome);
	abstract public void idade(int idade);
	abstract public void som(String som);
	
	public String getTipoAnimal() {
		return tipoSAnimal;
	}
	public void imprimirInfo() {
		System.out.println("---- Animais ---- ");
	}
	}
	
	



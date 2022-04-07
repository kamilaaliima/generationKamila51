package poo;
import java.util.List;
import java.util.ArrayList;
/*
 2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */

public class Aviao {
	
	private Integer quantPassageiros;
	private String modelo;
	private String ciaAerea;
	private List  listaAviao;
	


	public int getQuantPassageiros() {
		return quantPassageiros;
	}



	public void setQuantPassageiros(Integer quantPassageiros) {
		this.quantPassageiros = quantPassageiros;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public String getCiaAerea() {
		return ciaAerea;
	}



	public void setCiaAerea(String ciaAerea) {
		this.ciaAerea = ciaAerea;
	}

	public Aviao(){
		
	}
	
	public Aviao(Integer quantPassageiros, String modelo, String ciaAerea) {
		
		this.quantPassageiros = quantPassageiros;
		this.modelo = modelo;
		this.ciaAerea = ciaAerea;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Aviao> avioes = new ArrayList();
		
			Aviao jatinho = new Aviao(); //obijeto jatinho, do tipo aviao
			jatinho.setQuantPassageiros(200);
			jatinho.setModelo("Jatex");
			jatinho.setCiaAerea("Azul");
			avioes.add(jatinho);
			
			Aviao boing = new Aviao(); 
			boing.setQuantPassageiros(300);
			boing.setModelo("Bot");
			boing.setCiaAerea("Latam");
			avioes.add(boing);
			
			Aviao airbus = new Aviao(); 
			airbus.setQuantPassageiros(100);
			airbus.setModelo("Airbus");
			airbus.setCiaAerea("Gol");
			avioes.add(airbus);
			
			for(Aviao a : avioes) {
				
				String imprima = "O modelo do aviao é: " + a.getModelo()
						+" \nSua capacidade de passageiros é de: " + a.getQuantPassageiros()
						+ " \nPertence a companhia aeria: " + a.getCiaAerea();
				
				System.out.println(imprima);
				System.out.println("\n --------------- \n");
			}
			
			
	}



}

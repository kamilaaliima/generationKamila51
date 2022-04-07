package pOrientadaObjeto;

import java.util.ArrayList;
import java.util.List;

public class eletronico {
	
	public String marca;
	public String segmento;
	public String proprietario;
	public List listaEletronicos;

	public eletronico() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<eletronico> eletronicos = new ArrayList<>();

		eletronico celular = new eletronico();
		celular.setSegmento("telefonia");
		celular.setMarca("Iphone");
		celular.setProprietario("Kamila Lima");
		
		eletronico videoGame = new eletronico();
		videoGame.setSegmento("Jogos");
		videoGame.setMarca("Nitendo");
		videoGame.setProprietario("Gabriela Lima");
		
		eletronicos.add(videoGame);
		eletronicos.add(celular);
		
		for(eletronico lista : eletronicos) {
			
			String imprima = "O segmento do eletrônico é: " + lista.getSegmento()
			+" \nA marca: " + lista.getMarca()
			+ " \nPertence a: " + lista.getProprietario();
	
		System.out.println(imprima);
		System.out.println("\n ------------------------------------ \n");
			
		}
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getSegmento() {
		return segmento;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

}

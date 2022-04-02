package geneFamilia51;

import java.util.Scanner;

/*
 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias 
 e mostre-a expressa apenas em dias. 
 */
public class exeExtra1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade,dia,mes,idadeMes,idadeDia,idadeAnos;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite sua idade em anos: ");
		idade = leia.nextInt();
		System.out.println("\nDigite o mês que você nasceu: ");
		mes = leia.nextInt();
		System.out.println("\nDigite o dia que você nasceu: ");
	    dia = leia.nextInt();
		
	    idadeAnos = (idade * 365);
	    idadeMes = (mes * 30);
	    idadeDia = (idadeAnos + idadeMes + dia);
	    
	    System.out.println("\nSua idade em dias é: " +idadeDia);
	  
	}

}

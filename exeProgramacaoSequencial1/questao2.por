programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		inteiro dias, ano, mes, diasRestantes
		
		escreva("Insira aqui sua idade em dias:  ")
		leia(dias)

		ano = dias/365
		diasRestantes = dias%365 
		
		mes = diasRestantes/30
		dias = diasRestantes%30

		escreva("\nVocê tem ", ano, " anos ", mes, " mes e ", dias, " dias.")

		
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 360; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
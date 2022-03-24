programa
{
	
	funcao inicio()
	{
		inteiro P,E,M

		escreva("\n\t\tBalança para até 50kg")
		escreva("\n\t\tAviso: Multa por Kg de peso excedente = 4,00kg")

		escreva("\n\t\tDigite o peso total: ")
		leia(P)

		se (P>50)
		{
			E=P-50
			M=E*4

		
		escreva("\n\t\tO peso excedente é de: ",E,"Kg")
		escreva("\n\t\tA multa pelo peso excedente é de: ",M, ",00")
			
		}
		senao
		{
			
		escreva("\n\t\tO peso está dentro do limite, sem excedentes.")
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 461; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
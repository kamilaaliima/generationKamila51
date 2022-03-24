programa
{
	inclua biblioteca Matematica-->mat //mat.arredondar(x,2)= o x é a variável e o 2 é o número de casas depois da vírgula. 

	funcao inicio()
	{
		real a,b,c,d,E,f,x,y

		escreva("\nEscreva o valor de A: ")
		leia(a)
		escreva("\nEscreva o valor de B: ")
		leia(b)
		escreva("\nEscreva o valor de C: ")
		leia(c)
		escreva("\nEscreva o valor de d: ")
		leia(d)
		escreva("\nEscreva o valor de E: ")
		leia(E)
		escreva("\nEscreva o valor de F: ")
		leia(f)

		x=(c*E-b*f)/(a*E - b*d)
		y=(a*f - c*d)/(a*E - b*d)

		escreva("\nO valor de X é: ", mat.arredondar(x,2))
		escreva("\nO valor de Y é: ", mat.arredondar(y,2))
		

		
	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 633; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
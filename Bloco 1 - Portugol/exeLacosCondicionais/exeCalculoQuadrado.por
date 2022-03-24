programa
{
	inclua biblioteca Matematica-->mat
	
/* 3) Desenvolva um sistema em que: Leia 4 (quatro) números; Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for &gt;= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados. */

	funcao inicio()
	{
		real n1,n2,n3,n4,q1,q2,q3,q4

		escreva("\nLeia o primeiro número: ")
		leia(n1)
		escreva("\nLeia o segundo número: ")
		leia(n2)
		escreva("\nLeia o terceiro número: ")
		leia(n3)
		escreva("\nLeia o quarto número: ")
		leia(n4)


		q1 = mat.potencia(n1, 2.0)
		q2 = mat.potencia(n2, 2.0)
		q3 = mat.potencia(n3, 2.0)
		q4 = mat.potencia(n4, 2.0)

	se(q3 >= 1000)
	{
		escreva("\nQuadrado do terceiro número: ",q3)
		
	}
	senao
	{
		escreva("\nValor1: ",n1," seu quadrado: ",q1)
		escreva("\nValor2: ",n2," seu quadrado: ",q2)
		escreva("\nValor3: ",n3," seu quadrado: ",q3)
		escreva("\nValor4: ",n4," seu quadrado: ",q4)
		
	}

	

		
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 933; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	
	funcao inicio()
	{
		real num1,num2,resultado=0.0
		inteiro op
		//posso fazer com caracter '+,-,*,/'
		
		escreva("\nDigite o primeiro número: ")
		leia(num1)
		escreva("\nDigite o segundo número: ")
		leia(num2)
		escreva("\n\t\tCalcuradora Família 51")
		escreva("\n1- Soma\n2- Diferença\n3- Multiplicação\n4- Divisão")
		escreva("\nDigite sua opção: ")
		leia(op)

		escolha(op)
		{
			caso 1: //dois pontos pq é da sintase do caso
			resultado = num1 + num2
			pare
			caso 2:
			resultado = num1 - num2
			pare
			caso 3: 
			resultado = num1 * num2
			pare
			caso 4:
			se(num2==0)
			{
				escreva("\nNão é possovél fazer divisão por Zero!")
			}
			senao
			{
				resultado = num1 / num2
			}
			pare
			caso contrario: 
			escreva("\nOpção Inválida!!!")
			
			}
			escreva("\nResultado: ", resultado)

			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 832; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
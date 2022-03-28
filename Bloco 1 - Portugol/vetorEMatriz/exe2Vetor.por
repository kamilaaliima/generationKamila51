programa
{ /*2. Um dado é lançado 10 vezes e o valor correspondente é anotado. 
Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
A seguir determine e imprima a média aritmética dos lançamentos, contabilize 
e apresente também quantas foram as ocorrências da maior pontuação. */
	
	funcao inicio()
	{
		inteiro dado[10], somaLancamento=0, contMaior=0, x, maior=0, contMaior1=0
		real media

		para(x=0;x<10;x++)
		{
			escreva("\nEntre com o nº do lançamento: ")
			leia(dado[x])
			enquanto(dado[x]<1 ou dado[x]>6)// verificar se esse número existe no dado
			{
				escreva("\nEntre com o nº do lançamento: ")
				leia(dado[x])
			}
			somaLancamento += dado[x]
			se(dado[x] == 6)
			{
				contMaior++			
			}

			se(maior<dado[x])// verificar o maior de todos
			{
				maior = dado[x]	
			}

			para(x=0;x<10;x++)//quantidade de x que apareceu o maior, o maior pode não ser o 6
			{
				se(maior == dado[x])
				{
					contMaior1++
				}
			}
		}
		media = somaLancamento / 10
		escreva("\nMédia dos lançamentos: ",media)
		escreva("\nQuantidade do maior valor: ",contMaior)
		escreva("\nQuantidade de qualquer maior: ",contMaior1)

		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 718; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
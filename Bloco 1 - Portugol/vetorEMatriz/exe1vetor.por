programa
{
/*1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/
	
	funcao inicio()
	{
		real pontuacao[5], pont1, pont2, pont3, pont4, pont5, maiorPont
		inteiro x
	

		para(x=0;x<5;x++)
		{
			escreva("\nDigite a  pontuação: ")
			leia(pontuacao[x])
		}
		para(x=0;x<5;x++)

		{
			escreva("\nAqui estão suas pontuações - ",x+1,": ",pontuacao[x])
			
		}

		maiorPont = pontuacao[0]
		para(x=0;x<5;x++)
		{
			
		
			se(maiorPont < pontuacao[x])
			{
				maiorPont = pontuacao[x]
			}
		}

		escreva("\nA maior pontuação é: ", maiorPont)

		

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 535; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
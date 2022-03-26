programa
{
/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando 
dados sobre o salário e número de filhos. A prefeitura deseja saber: a) média do salário da população;
b) média do número de filhos; c) maior salário; d) percentual de pessoas com salário até R$100,00.*/
	
	
	funcao inicio()
	{
		real salario, somaSalario = 0.00, mediaSalario, mediaNf, maiorSalario = 0.00, perc
		inteiro numeroFilhos, somaNf=0, cont100=0,x

		para(x=1;x<=4;x++)
		{
			escreva("Digite o seu salário: ",x," : ")
			leia(salario)
			escreva("Digite o número de filhos: ",x," : ")
			leia(numeroFilhos)
			
			somaSalario = somaSalario + salario
			somaNf = somaNf + numeroFilhos

			se(maiorSalario < salario)
			{
				maiorSalario = salario
			}
			se(salario<=100)
			{
				cont100++
			}	
		}

			mediaSalario = somaSalario / 4
			mediaNf = somaNf / 4
			perc = (cont100 *100)/4

			escreva("\nMédia salarial: ",mediaSalario)
			escreva("\nMédia do número de filhos: ",mediaNf)
			escreva("\nMaior salário: ",maiorSalario)
			escreva("\nPercentual de pessoas com salário até 100: ",perc)
			
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 902; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
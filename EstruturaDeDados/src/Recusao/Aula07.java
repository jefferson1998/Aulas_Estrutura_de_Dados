package Recusao;

public class Aula07 {
	
	public static int questao01MaiorValorDeUmaMatrizRecursao(int[][]matriz, int l, int c, int maior) {
		// verifica a linha se há linha p/ ser percorrida
		if(l < matriz.length) {
			// verifica há coluna p/ ser percorrida
			if(c < matriz[l].length) {
				// verificar se há elemento maior que o primeiro elemento
				if(matriz[l][c] > maior) {
					maior = matriz[l][c];
				}
				// incrementa mais uma COLUNA ++c (c + 1) e retorna.
				return questao01MaiorValorDeUmaMatrizRecursao(matriz, l, ++c, maior);	
			}
			// incrementa mais uma LINHA ++l (l + 1) e retorna.
			return questao01MaiorValorDeUmaMatrizRecursao(matriz, ++l, 0, maior);
		}
		// retorna o maior valor
		return maior;
	}
	
	// metodo auxiliar, ele tem a função de pegar SOMENTE a MATRIZ e acrescentar os INDÍCIES e o ATRIBUTO MAIOR VALOR.
	public static int questao01MaiorValorDeUmaMatrizRecursao(int[][]matriz) {
		// determinação do indícies LINHA/COLUNA
		int l = 0, c = 0;
		// determinação do atributo que irá comprar se há MAIOR VALOR na MATRIZ que o PRIMEIRO VALOR
		int maior = matriz[0][0];
		// retorna o resultado do primeiro método.
		return questao01MaiorValorDeUmaMatrizRecursao(matriz,l,c,maior);
	}
	
	public static void main(String[] args) {
		int [][]matriz = {
				{1,0},
				{2,1},
				{5,2}
		};
		System.out.println(questao01MaiorValorDeUmaMatrizRecursao(matriz));
		
	}
	
	
}

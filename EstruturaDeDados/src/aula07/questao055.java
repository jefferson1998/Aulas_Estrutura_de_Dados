package aula07;

public class questao055 {
	public static int somaMatriz(int[][]matriz) {
		int soma = 0;
		
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz[l].length; c++) {
				soma += matriz[l][c];
			}
		}
		return soma;
	}
	
	public static void main(String[] args) {
		int[][] matriz = {
				{1,2},
				{2,3},
				{3,7}

		};
		
		System.out.println(somaMatriz(matriz));
	}
}

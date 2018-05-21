package aula07;

import java.util.Arrays;

public class questao08 {
	public static int []somaLinhasDaMatriz(int [][]matriz) {
		int []array = new int [matriz.length];
		int somatorio = 0;
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz[l].length; c++) {
				somatorio += matriz[l][c];
			}
			array[l] = somatorio;
			somatorio = 0;
		}
		
		return array;
	}
	
	public static void main(String[] args) {
		int [][] matriz = {
				{1,2,3},
				{2,1,4},
				{3,4,1}
		};
		
		System.out.println(Arrays.toString(somaLinhasDaMatriz(matriz)));
	}
}

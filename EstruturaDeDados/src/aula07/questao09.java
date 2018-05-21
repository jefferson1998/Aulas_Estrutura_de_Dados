package aula07;

import java.util.Arrays;

public class questao09 {
	public static int[] somaColunas(int [][]matriz) {
		int []array = new int [0];
		int somatorio = 0;
		for(int l = 0; l < matriz.length; l++) {
			array = new int [matriz[l].length];
		}
		
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz[l].length; c++) {
				somatorio += matriz[c][l];
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
				{5,9,2}
		};
		
		System.out.println(Arrays.toString(somaColunas(matriz)));
	}
	
}

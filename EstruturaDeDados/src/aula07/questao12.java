package aula07;

import java.util.Arrays;

public class questao12 {
	
	public static int[][] matrizRotacionadaAnoventaGraus(int[][]m) {
		int [][]rotacionada = new int[m[0].length][m.length];
	
		for(int l = 0; l < rotacionada.length; l++) {
			for(int c = 0; c < rotacionada[l].length; c++) {
				rotacionada[l][c] = m[m[0].length - c][l];
			}
		}
		return rotacionada;	
	}
	
	public static void main(String[] args) {
		int [][]m = {
				{1,2},
				{2,1},
				{5,2}
		};
		
		for(int[] l : matrizRotacionadaAnoventaGraus(m)) {
			System.out.println(Arrays.toString(l));
		}
		
		//System.out.println(matrizRotacionadaAnoventaGraus(m));
	}
	

}
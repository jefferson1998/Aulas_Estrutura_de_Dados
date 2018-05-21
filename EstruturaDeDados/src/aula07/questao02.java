package aula07;

import java.util.Arrays;

public class questao02 {
	public static int[] questao02(int [][] m) {
		
		int linhaColuna[] = new int [2];
		int menor = m[0][0];
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				if(m[i][j] < menor) {
					linhaColuna[0] = i;
					linhaColuna[1] = j;
					menor = m[i][j];
				}
			}
		}
		
		
		return linhaColuna;
		
		
	}
	
	public static void main(String[] args) {
		
		int[][] m = {
				{1,2,3},
				{2,3,-5},
				{1,2}
				
		};
		System.out.println(Arrays.toString(questao02(m)));
		
	}

}

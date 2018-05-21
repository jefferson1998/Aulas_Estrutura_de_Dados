package aula07;

import java.util.Arrays;

public class questao11 {
	public static int subMatriz(int [][]m) {
		int cont = 0;
		int [][]subMatriz = {
				{0,1},
				{1,0}		
		};
		for(int l = 0; l < m.length; l++) {
				for(int c = 1; c <= m[l].length; c++) {
					if(m[l][c - 1] == subMatriz[0][0] && m[l][c] == subMatriz[0][1]
							&& m[l + 1][c - 1] == subMatriz[1][0] && m[l + 1][c] == subMatriz[1][1]) {
						cont++;
					}
				}
		}
		return cont;
		}
		
public static void main(String[] args) {
		
		int[][] m = {
				{1,0,1,2},
				{0,1,0,4},
				{1,5,3,7},
				{1,1,5,9}
				
		};
		
	
			System.out.println(subMatriz(m));
		
		
		
	}
}

package aula07;

import java.util.Arrays;

public class questao04 {
	public static int[][] somaDeMatrizes (int[][] m1, int [][]m2) {
		
	boolean ok = true;
	
	if(m1.length != m2.length) {
		ok = false;
	} else {
		for(int i = 0; i < m1.length; i++) {
			for(int j = 0; j < m1[i].length; j++) {
				if(m1[i].length != m2[i].length) {
					ok = false;
				}
			}
		}
	}
	
	if(ok) {
		for(int i = 0; i < m1.length; i++) {
			for(int j = 0; j < m1.length; j++) {
				m1[i][j] = m1[i][j] + m2[i][j];
			}
		}
		return m1;
	}
	return null; 
	
	
	
}
	
public static void main(String[] args) {

	int[][] m1 = {
			{1,2},
			{2,3}

	};
	
	int[][] m2 = {
			{1,2},
			{2,5}
	};
	
	System.out.println(Arrays.toString(somaDeMatrizes(m1, m2)));
}
}

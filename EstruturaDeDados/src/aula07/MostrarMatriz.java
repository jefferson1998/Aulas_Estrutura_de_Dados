package aula07;

public class MostrarMatriz {
	public static String somaMatrizes (int[][] m1, int [][]m2) {
		
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
		String mo = "";
		if(ok) {
			for(int i = 0; i < m1.length; i++) {
				
				for(int j = 0; j < m1.length; j++) {
					m1[i][j] = m1[i][j] + m2[i][j];
					mo += m1[i][j] + " ";
				}
				mo += "\n";
			}
			
			return mo;
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
		
		System.out.println(somaMatrizes(m1, m2));
	}
}

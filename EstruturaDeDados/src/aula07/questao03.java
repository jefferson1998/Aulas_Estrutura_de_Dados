package aula07;

public class questao03 {
	public static boolean matrizIgual(int[][] m1, int[][] m2) {
		
		if(m1.length != m2.length) {
			return false;
		} else {
			for(int i = 0; i < m1.length; i++) {
				
				for(int j = 0; j < m1[i].length; j++) {
					
					if(m1[i].length != m2[i].length) {
						return false;
					} else {
						
						if(!(m1[i][j] == m2[i][j])) {
							return false;
						}
					}	
				}
			}
			
			
			return true;
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		int[][] m1 = {
				{1,2},
				{2,3}
	
		};
		
		int[][] m2 = {
				{1,2},
				{2,3}
		};
		
		System.out.println(matrizIgual(m1, m2));
		
	}
}

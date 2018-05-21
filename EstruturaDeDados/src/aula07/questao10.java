package aula07;

public class questao10 {
	public static boolean verificarElementosDaBordaDaMatriz(int [][]m) {
		for(int l = 0; l < m.length; l++) {
			for(int c = 0; c < m[l].length; c++) {
//				if(m[0][c] != 1 || m[m.length - 1][c] != 1) {
//					return false;
//				}
//			 if(m[c][0] != 1 || m[c][m[l].length - 1] != 1) {
//					return false;
//				} 
//				if (m[c + 1][l + 1] != 0 || m[m.length - 2][m[l].length - 2] != 0) {
//					return false;
//				}
				if(l == 0 || l == m.length - 1 || c == 0 || c == m[l].length -1) {
					if(m[l][c] != 1) {
						return false;
					}
				} else {
					if(m[l][c] != 0) {
						return false;
					}
				}
					
				
			}
		}
		return true;	
	}
	
	public static void main(String[] args) {
		int [][] matriz = {
				{1,1,1,1,1},
				{1,0,0,0,1},
				{1,0,0,0,1},
				{1,0,0,0,1},
				{1,1,1,1,1}
				
		};
		
		System.out.println(verificarElementosDaBordaDaMatriz(matriz));
		
	}

}

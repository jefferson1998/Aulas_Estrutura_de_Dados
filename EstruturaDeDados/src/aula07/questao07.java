package aula07;

public class questao07 {
	public static boolean matrizSimetrica (int[][]matriz) {
		
		for(int l = 0; l < matriz.length; l++) {
			if(matriz.length != matriz[l].length) {
				return false;
			} else {
				for(int c = 0; c < matriz[l].length; c++) {
					if(matriz[l][c] != matriz[c][l]) {
						return false;
					}
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int [][] matriz = {
				{1,2,3},
				{2,1,4},
				{3,4,1}
		};
		
		System.out.println(matrizSimetrica(matriz));
	}
}

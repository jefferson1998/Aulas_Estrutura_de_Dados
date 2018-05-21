package aula07;


public class questao06 {
	public static int[][] transposta (int[][]matriz) {
		int[][] trans = new int [0][0];
		
		for(int i = 0; i < matriz.length; i++) {
			trans = new int [matriz[i].length][matriz.length];
		}
		
		for(int l = 0; l < trans.length; l++) {
			for(int c = 0; c < trans[l].length; c++) {
				trans[l][c] = matriz [c][l];
			
			}
		}
		
		return trans;
	}
	
	public static void main(String[] args) {
		int[][] matriz = {
				{1,2},
				{2,3},
				{3,7}

		};

		int[][] trans = new int [0][0];
		
		for(int i = 0; i < matriz.length; i++) {
			trans = new int [matriz[i].length][matriz.length];
		}
		String mostrar = "";
		for(int l = 0; l < trans.length; l++) {
			for(int c = 0; c < trans[l].length; c++) {
				trans[l][c] = matriz [c][l];
				mostrar += trans[l][c] + " ";
			}
			mostrar += "\n";
		}
		System.out.println(mostrar);
		
//		System.out.println(Arrays.toString(matriz) + "\n" + Arrays.toString(transposta(matriz)));
	}
}

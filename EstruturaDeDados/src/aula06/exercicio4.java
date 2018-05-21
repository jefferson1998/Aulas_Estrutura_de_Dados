package aula06;

import java.util.Arrays;

public class exercicio4 {
	public static int [] contagemPares(int []array) {

		int cont = 0;
		
		
		for(int i = 1; i < array.length; i += 2) {
			if(array[i] % 2 == 0) {
				cont++;
			}
		}
		
		int arrayPares [] = new int [cont];
		cont = 0;
		for(int i = 1; i < array.length; i +=  2) {
			if(array[i] % 2 == 0) {
				arrayPares[cont++] = array[i];
			}
		}
		
		return arrayPares;
	
	}

	public static void main(String[] args) {
		int array[] = new int [] {1,3,4,6,8,11};
		
		System.out.println(Arrays.toString(array) + " " + Arrays.toString(contagemPares(array)));
	}
}

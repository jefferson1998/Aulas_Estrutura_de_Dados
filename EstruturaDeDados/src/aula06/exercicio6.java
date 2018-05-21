package aula06;

import java.util.Arrays;

public class exercicio6 {
	public static int[] arrayInicioFim(int []array, int inicio, int fim) {
		
		int []arrayNovo = new int [fim - inicio + 1];
		for(int i = inicio; i <= arrayNovo.length; i++) {
			arrayNovo[i - inicio] = array[i];
		}
		
		return arrayNovo;
	}
	
	public static void main(String[] args) {
		int inicio = 1, fim = 5;
		int array[] = new int [] {1,3,4,6,8,11};
		
		System.out.println(Arrays.toString(array) + " " + Arrays.toString(arrayInicioFim(array, inicio, fim)));
	}
}

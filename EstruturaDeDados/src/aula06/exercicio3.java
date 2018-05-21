package aula06;

import java.util.Arrays;

public class exercicio3 {
	public static int exercicio3 (int [] array) {
		int cont = 0;
		for(int i = 0; i < array.length - 1; i++) {
			if(array[i] % 2 == 0  && array[i + 1] % 2 == 0) {
				cont++;
			}
		}
		
		return cont;
	}
	
	public static void main(String[] args) {
		int array[] = new int [] {0,2,4,6,8,11};
		
		System.out.println(Arrays.toString(array) + " " + exercicio3(array));
	}
}

package aula3;

import java.util.Arrays;
import java.util.Random;

public class Exercicio3 {
	public static void main(String[] args) {
		Random r = new Random();
		
		int x = r.nextInt(10) + 1;
		int y = r.nextInt(10) + 1;
		int array1[] = new int [x];
		int array2[] = new int [y];
		
		
		for(int i = 0; i < array1.length; i++) {
			array1[i] = r.nextInt(10) + 1;
		}
		
		for(int i = 0; i < array2.length; i++) {
			array2[i] = r.nextInt(10) + 1;
		}
		System.out.println(Arrays.toString(array1) + Arrays.toString(array2));
		System.out.println(Arrays.toString(inversao(array1, array2)));
	}
	
	public static int[] inversao (int []array1, int []array2) {
		int[]inversao = new int [array1.length + array2.length];
		
		for(int i = 0; i < array1.length; i++) {
			inversao[i] = array1[i];
		}
		
		for(int i = array2.length - 1, j = 0; i >= 0; i--, j++) {
			inversao[array1.length + j] = array2[i]; 
		}
		
		return inversao;
	}
}

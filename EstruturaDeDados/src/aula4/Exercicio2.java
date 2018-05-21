package aula4;

import java.util.Arrays;
import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] array = new int [r.nextInt(6) + 4];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(10) + 1;
		}
		System.out.println(Arrays.toString(array) + maior(array));

	}
	
	public static int maior(int[] array) {
		int segundoMaior = 0, scape = 0;
		int interacao = 0;
		while (interacao <= array.length) {
			for (int i = 1; i < array.length; i++) {
				if (array[i] > array[i - 1]) {
					scape = array[i -1];
					array[i -1] = array[i];
					array[i] = scape;
					
				}
			}
			interacao++;
		}
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] != array[0]) {
				segundoMaior = array[i];
				break;
			}
		}
		
		
		
		return segundoMaior;
		
	}

}

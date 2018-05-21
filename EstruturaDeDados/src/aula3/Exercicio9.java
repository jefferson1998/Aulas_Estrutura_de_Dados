package aula3;

import java.util.Arrays;
import java.util.Random;

public class Exercicio9 {
	public static int diferenca (char []array1, char []array2) {
		for(int i = 0; i < array1.length || i < array2.length; i++) {
			if(array1[i] != array2[i]) {
				return i;
			}
		}
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		Random r = new Random();
		char []array1 = new char [r.nextInt(3) + 1];
		char []array2 = new char [r.nextInt(3) + 1];
		for(int i = 0; i < array1.length; i++) {
			array1[i] = (char) (r.nextInt(100 - 97 + 1) + 97);
		}
		
		for(int i = 0; i < array2.length; i++) {
			array2[i] = (char) (r.nextInt(100 - 97 + 1) + 97);
		}
		
		System.out.println(Arrays.toString(array1) + "\n"+ Arrays.toString(array2) + "\n" + diferenca(array1, array2));
	}

}

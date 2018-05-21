package aula06;

import java.util.Arrays;

public class exercicio7 {
	
	public static void main(String[] args) {
		int array1[] = new int [] {1,3,4,6,8,11};
		int array2[] = new int [] {0,0,0,0,0,0};
		int ini1 = 1, ini2 = 2, tam = 3;
		
		System.out.println(Arrays.toString(array1) + " " + Arrays.toString(array2) + "\n" + davidCabu(ini1, ini2, tam, array1, array2));
	}
	public static String davidCabu (int ini1, int ini2, int tam, int []array1, int []array2) {
		if(ini1 < 0 || ini1 > array1.length || (ini1 + tam) > array2.length || tam < 0) {
			return "Impossível, meu fi";		
		} else {
			if(ini2 < 0 || (ini2 + tam) > array2.length) {
				return "Impossível, meu fi";	
			} else {
				for(int i = ini2, j = ini1; i < array2.length && j <= tam; i++, j++) {
					array2[i] = array1[j];
				}
				return Arrays.toString(array2);
			}
		}
	}
		
}

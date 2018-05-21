package aula06;

import java.util.Arrays;

public class exercicio1 {
public static int [] array (int []array1) {
		
		int cont = 0;
		for(int i = 0; i < array1.length; i++) {
			if(array1[i] > 0) {
				cont++;
			}
		}
		int array2[] = new int [cont];
		cont = 0;
		
		for(int i = 0; i < array1.length; i++) {
			if(array1[i] > 0) {
				array2[cont++] = array1[i];
			}
		}
		
		return array2;
	}
	
	public static void main(String[] args) {
		int array[] = new int [] {1,2,-1,-50,5};
		
		System.out.println(Arrays.toString(array) + " " + Arrays.toString(array(array)));
	}
}

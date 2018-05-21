package aula3;

import java.util.Arrays;
import java.util.Random;

public class Exercicio1 {
	public static void main(String[] args) {
		Random r = new Random();
		
		int x = r.nextInt(10) + 1;
		int y = r.nextInt(10) + 1;
		int array1[] = new int [] {1,2,3,4};
		int array2[] = new int [] {5,6,7,8};
		
		
//		for(int i = 0; i < array1.length; i++) {
//			array1[i] = r.nextInt(10) + 1;
//		}
//		
//		for(int i = 0; i < array2.length; i++) {
//			array2[i] = r.nextInt(10) + 1;
//		}
		System.out.println(Arrays.toString(array1) + Arrays.toString(array2));
		System.out.println(Arrays.toString(concatenaca(array1, array2)));
		
		
	}
	public static int[] concatenaca (int []array1, int []array2){
		//criar o array concatenado
		int arrayConca[] = new int [array1.length + array2.length] ;
		//inserir o primeiro array.
		for(int i = 0; i < array1.length; i++) {
			arrayConca[i] = array1[i];
			
		}
		// pegar a última posição do primeiro array e a partir dela inserir o outro.
		//Ou seja, o novo array na posição do tamanho do primeiro array.
		for(int i = 0; i < array2.length; i++) {
			arrayConca[array1.length + i] = array2[i];
		}
		return arrayConca;
	}
}

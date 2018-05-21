package aula3;

import java.util.Arrays;
import java.util.Random;

public class Exercicio7 {

	public static void main(String[] args) {
		Random r = new Random();
		byte []array = new byte [2];
		byte []array2 = new byte [2];
		for(int i = 0; i < array.length; i++) {
			array[i] = (byte) (r.nextInt(10) + 1);
			array2[i] = (byte) (r.nextInt(10) + 1);
		}
		
		System.out.println(Arrays.toString(array) + "\n" + Arrays.toString(array2) + "\n" + arrayByte(array, array2));
	}
	
	public static boolean arrayByte (byte []array, byte []array2){
		boolean condicao = false;
		int cont = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == array2[i]) {
				cont++;
			}
		}
		
		if(cont == array.length) {
			condicao = true;
		}
		
		return condicao;
	}

}

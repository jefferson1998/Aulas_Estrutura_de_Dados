package aula4;

import java.util.Arrays;
import java.util.Random;

public class exercicio3 {

	public static void main(String[] args) {
		Random r = new Random();
		
		String []array = new String [r.nextInt(10) + 1];
		
		for(int i = 0; i < array.length; i++) {
			int tamanhoString = r.nextInt(7) + 1;
			for(int j = 0; j < tamanhoString; j++) {
				array[i] += (char) (r.nextInt(69 - 65 + 1) + 65);
			}
		}
		
		System.out.println(Arrays.toString(array) + menorString(array));

	}
	
	public static String menorString (String []array) {
		String menor = "";
		int tamanho = array[0].length();
			for(int i = 0; i < array.length; i++) {
				if(array[i].length() <= tamanho) {
					tamanho = array[i].length();
					menor = array[i];
				}
			}
		return menor + " Tamanho: " + tamanho;
	}

}

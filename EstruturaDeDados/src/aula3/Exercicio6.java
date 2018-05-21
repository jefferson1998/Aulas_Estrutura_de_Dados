package aula3;

import java.util.Arrays;
import java.util.Random;

public class Exercicio6 {
	public static int somaImpares(int []x) {
		int soma = 0;
		for(int i = 0; i < x.length; i++) {
			if(x[i] % 2 == 1) {
				soma += x[i];
			}
		}
		
		return soma;
	}
	public static void main(String[] args) {
		Random r = new Random();
		int []array = new int [r.nextInt(10) + 1];
		for(int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(15) + 1;
		}
		System.out.println(Arrays.toString(array) + "Soma dos impares: " + somaImpares(array));
	}

}

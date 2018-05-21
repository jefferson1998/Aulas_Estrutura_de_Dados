package aula4;

import java.util.Arrays;
import java.util.Random;

public class Exercicio1 {
	public static double maiorValorEmUmArray(double[] array) {
		double maior = 0;
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] > maior) {
				 maior = array[i];
			}
		}
		
		return maior;
		
	}
	
	public static void main(String[] args) {
		Random r = new Random();
		double[] array = new double [r.nextInt(6) + 4];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (Math.random() * (5 - 1) + 1);
		}
		
		System.out.println(Arrays.toString(array) + maiorValorEmUmArray(array));
	}
}



package aula3;

import java.util.Arrays;
import java.util.Random;

public class Exercicio5 {
	
	public static void main(String[] args) {
		Random r = new Random();
		String x[] = new String [r.nextInt(15) + 1];
		int cont = 0;
		for(int i = 0; i < x.length; i++) {
			String array = "";
			for(int j = 0; j < 2; j++) {
				array += (char) (r.nextInt(122 - 97 - 1) + 97);
			}
			x[i] = array;
			
		}
		for(int i = 0; i < x.length; i++) {
			
			if(x[i].equals("if")) {
				cont++;
			}
		}
		
		System.out.println(Arrays.toString(x) + cont);
	}
	
	

}
	

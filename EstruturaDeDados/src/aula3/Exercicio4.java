package aula3;

import java.util.Arrays;
import java.util.Random;

public class Exercicio4 {
	public static void main(String[] args) {
		Random r = new Random();
		char x[] = new char [r.nextInt(10) + 1];
		int aleatorio = 0;
		int cont = 0;
		for(int i = 0; i < x.length; i++) {
			aleatorio = r.nextInt(122 - 37 + 1) + 37;
			x[i] = (char) aleatorio;
		}
		String fora =  "";
		
		for(int i = 0; i < x.length; i++) {
		
			if(x[i]  <= 64  || x[i]  >= 91 && x[i]  <= 96) {
				fora += x[i] + " ";
				cont++;
			}
			
		}
		System.out.println(Arrays.toString(x) +  "Quantidade fora do intervalor: " + cont + "\n fora do intervalo: " + fora);
		
		
	}
}

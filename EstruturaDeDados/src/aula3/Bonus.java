package aula3;

import java.util.Arrays;
import java.util.Random;

public class Bonus {
	public static void main(String[] args) {
		Random r = new Random();		
		
		char[] palavra = new char[r.nextInt(10) + 1];
		for(int i = 0; i < palavra.length; i++) {
			palavra[i] = (char) (r.nextInt(70 - 65 + 1) + 65);
		}
		
		char[] letras = new char[r.nextInt(3) + 1];
		String verificar2 = "";
			for(int i = 0; i < letras.length; i++) {
				letras[i] = (char) (r.nextInt(70 - 65 + 1) + 65);
				verificar2 += letras[i];
			}
		
		String verificar = "";
		int cont = 0;
		for(int i = 0; i < palavra.length; i++) {
			verificar += palavra[i];
			if(verificar.contains(verificar2)) {
				verificar = "";
				cont++;
			}
		}
		
		System.out.println(Arrays.toString(palavra) + "\n " + "Letras geradas automaticamente: " + 
		Arrays.toString(letras) + " Quantidades de vezes repetidas: " +  cont);
		
	}
}

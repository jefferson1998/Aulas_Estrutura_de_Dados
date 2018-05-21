package Recusao;

import java.util.Arrays;

public class Aula02 {
	public static int [] questao2ConcatenacaoPrimeiroArray(int []a1, int i, int[]aConcatena) {
		if(i < a1.length) {
			aConcatena[i] = a1[i];
			return questao2ConcatenacaoPrimeiroArray(a1, i + 1, aConcatena);
		}
		
		return aConcatena;
	}
	
	public static int [] questao2ConcatenacaoSegundoArray(int[]a1, int []a2,  int i, int []aConcatena) {
		if(i < a2.length) {
			aConcatena[i + a1.length] = a2[i];
			return questao2ConcatenacaoSegundoArray(a1, a2, ++i, aConcatena);
		}
		
		return aConcatena;
		
	}
	
	
	public  static int[] questao2ConcatenacaoDeDoisArrays(int []a1, int []a2) {
		int [] aConcatena = new int [a1.length + a2.length];
		return questao2ConcatenacaoSegundoArray(a1, a2, 0, aConcatena);
	}
	
	
	public static int [] questao2ConcatenaArraysUmRecussao(int []a1, int []a2, int i, int []aConcatena) {

		if(i < aConcatena.length) {
			if(i < a1.length) {
				aConcatena[i] = a1[i];
			}
			if(i >= a2.length) {
				aConcatena[i] = a2[i - a2.length];
			}
			return questao2ConcatenaArraysUmRecussao(a1, a2, ++i, aConcatena);
		}
		
		return aConcatena;
	}
	

	
	
	
	public static void main(String[] args) {
		int a1[] = new int [] {1,2,3,4};
		int a2[] = new int [] {5,6,7,8};
		int[] concatena =  new int [a1.length + a2.length];
		concatena = questao2ConcatenacaoDeDoisArrays(a1, a2);
		System.out.println(Arrays.toString(concatena));
		System.out.println(Arrays.toString(questao2ConcatenacaoPrimeiroArray(a1,0,concatena)));
		System.out.println(Arrays.toString(questao2ConcatenaArraysUmRecussao(a1, a2, 0, concatena)));
		
		
	}
}

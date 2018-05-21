package revisãoParaProva;

import java.util.Arrays;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class cifra {
	public static char[] cifraArray (char [] a) {
		
		char [] Retorno = new char [a.length];
		char[] descifra = new char [] {'V', 'M', 'G', 'J','O', 'A','C','B','S','Y','N','I','Z','X','W','F','U','Q','K','R',
				'P','L','H','D','E', 'T'};
		
		
		for(int i = 0; i < a.length; i++) {
			a[i] = descifra[descifra[i] - 'A'];
		} 	
		return a;
	}
	
	public static char[] descifraArray(char[]a) {
		char[] cifra = new char [] {'A', 'B', 'C', 'D','E', 'F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T',
				'U','V','W','X','Y', 'Z'};
		char[] descifra = new char [] {'V', 'M', 'G', 'J','O', 'A','C','B','S','Y','N','I','Z','X','W','F','U','Q','K','R',
				'P','L','H','D','E', 'T'};
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < descifra.length; j++) {
				if(a[i] == descifra[j]) {
					a[i] = cifra[j];
				}
			}
		}
		
		return a;
	}
	
	
	public static int arraySequencia(int []array) {
		int cont = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(array[i] != array[j]) {
					cont++;
					break;
				}
			}
		}
		return cont;
	}
	
	public static int maior (int []array) {
		int maior = array[0];
		for(int i = 0; i < array.length; i++) {
			if(array[i] > maior) {
				maior = array[i];
			}
		}
		return maior;
	}
	
	public static int menor (int []array) {
		int menor = array[0];
		for(int i = 0; i < array.length; i++) {
			if(array[i] < menor) {
				menor = array[i];
			}
		}
		return menor;
	}
	
	public static double media (int []array) {
		double media = 0;
		for(int i = 0; i < array.length; i++) {
			media += array[i];
		}
		return media / array.length;
	}
	
	public static double [] arrayMaiorMenorEMedia(int []array) {
		double arrayNovo[] = new double[3];
		arrayNovo[0] = maior(array);
		arrayNovo[1] = menor(array);
		arrayNovo[2] = media(array);
		return arrayNovo;
	}
	
	public static void main(String[] args) {
		char [] a =	new char []{'D','A','V','I','D'};
		System.out.println(Arrays.toString(cifraArray(a)));
		int [] ai = new int [] {1,1,2,2,3,4};
		System.out.println(arraySequencia(ai));
		
		int [] array = new int [] {5,6,6};
		System.out.println(Arrays.toString(arrayMaiorMenorEMedia(array)));
	}
}

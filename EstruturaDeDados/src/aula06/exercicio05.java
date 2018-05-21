package aula06;

public class exercicio05 {
	public static char[] trocaMaisculaMinuscula(char[]a){
		char[]novo = new char[a.length];
		
		for(int i = 0; i < novo.length; i++) {
			if(a[i] >= 'a' && a[i] <= 'z') {
				novo[i] = (char) ((a[i] - 'a') + 'A');
			} else if(a[i] >= 'A' && a[i] <= 'Z') {
				novo[i] = (char) ((a[i] - 'A') + 'a');
			} else {
				novo[i] = ' ';
			}
		}
		
		return novo;
	}
}

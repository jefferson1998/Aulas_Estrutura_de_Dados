package aula06;

public class exercicio2 {
	public static char[] exercicio2 (char []array) {
		char [] array2 = new char [array.length / 2];
		for(int i = 0; i < array.length / 2; i++) {
			array2[i] = array[i];
		}
		
		return array2;
	}
}

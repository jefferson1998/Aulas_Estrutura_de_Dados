package aula4;

public class exercicio6 {
	public static boolean crescente (int []array) {
		for(int i = 0; i < array.length -1; i++) {
			if(array[i] > array[i + 1]) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean decrescente (int []array) {
		for(int i = 0; i < array.length -1; i++) {
			if(array[i] < array[i + 1]) {
				return false;
			}
		}
		return true;
	}
	
	public static int checa (int []array) {
		if(crescente(array)) {
			return 1;
		}
		if(decrescente(array)) {
			return -1;
		}
		return 0;
	}
}

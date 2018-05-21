package aula3;

public class MetodosExercicios {
	public static int[] exercicio1 (int array1[], int array2[]){
		int []array = new int [array1.length + array2.length];
		String arrayTotal = "";
		
			for(int j = 0; j < array1.length; j++) {
				array[j] = array1[j];
				arrayTotal = arrayTotal + array[j] + " ";
			}
			int d = 0;
			for(int k = array1.length; k < array.length; k++) {
				array[k] = array2[d];
				d++;
				arrayTotal = arrayTotal + array[k] + " ";
			}
	
		return array;
	}
	
	public static String exercicio2(int array1[]) {
		int array [] = new int [array1.length];
		String mostrar = "";
		for(int i = array.length, j = 0; i != 0; i--, j++) {
			array[j] = array1[i];
			mostrar = mostrar + array[j];
		}
		return mostrar;
		
	}

}

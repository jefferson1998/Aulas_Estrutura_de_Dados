package aula07;

public class sudoku {
	public static void main(String[] args) {
		int []array = new int [] {1,2,3,4,5,6,7,8,9};
		
		System.out.println(velha(array));
	}
	public static String velha(int []array) {
		String mostrar = "";
		int contador = 0;
		for(int i = 0; i < array.length; i++) {
			mostrar += array[i] + "|";
			contador++;
			if(contador == 3) {
				contador = 0;
				mostrar += "\n";
			}
		}
		return mostrar;
	}
}

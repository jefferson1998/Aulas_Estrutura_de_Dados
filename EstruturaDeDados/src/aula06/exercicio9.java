package aula06;

public class exercicio9 {
	
	public static String fibonacci (int []array) {
		for(int i = 1; i < array.length - 1; i++) {
				if(!(array[i] + array[i - 1] == array[i + 1])){
					return "Não é uma sequência";
				}
			}
		
		return " é uma sequência";
		
	}
	
	public static void main(String[] args) {
		int []array = new int []{0,1,1,2,3,5};

		System.out.println(fibonacci(array));
	}
}

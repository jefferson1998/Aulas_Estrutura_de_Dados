package aula4;

public class Exercicio4 {

	public static void main(String[] args) {
		String palavra = "ovos";
		
		System.out.println(palindromo(palavra));

	}
	
	public static boolean palindromo(String palavra) {
		char array[] = palavra.toCharArray();
		String teste = "";
		for (int i = 0; i < array.length; i++) {
			teste += array[array.length - 1 - i];
		}

		if (palavra.equals(teste)) {
			return true;
		} else {
			return false;
		}
	}
	

}

import java.util.Random;

public class ExerciciosMetodos {

	public static String imprimeArray(int[] array) {
		String valores = "";

		for (int i = 0; i < array.length; i++) {
			valores = valores + array[i] + " ";
		}

		return valores;
	}

	public static String invertidoArray(int[] array) {
		String valores = "";

		for (int i = array.length; i > 0; i--) {
			valores = valores + i + " ";
		}

		return valores;
	}

	public static String paresArray(int[] array) {
		String valores = "";

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				valores = valores + array[i] + " ";
			}
		}
		return valores;
	}

	public static String imparesArray(int[] array) {
		String valores = "";

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				valores = valores + array[i] + " ";
			}
		}
		return valores;
	}

	public static String trasFrenteArray(int[] array) {
		String valores = "";

		for (int i = 0; i < array.length; i++) {

			valores = valores + array[array.length - 1 - i] + " ";
		}
		return valores;
	}

	public static String quintoArray(int[] array, int valorX, int valorY, int valorK) {
		String valores = "";
		Random r = new Random();

		int cont = 0;
		for (int i = 0; i < array.length; i++) {
			int c = r.nextInt(valorY - valorX + 1) + valorX;
			array[i] = c;
			if (valorK == c) {
				cont++;
			}
			valores = valores + c + " ";
		}
		return valores + "valor escolhido: " + valorK + "vezes apecidas: " + cont;
	}

	public static int sextoArray(int[] array) {
		int total = 0;

		for (int i = 0; i < array.length; i++) {
			total = total + array[i];
		}

		return total;
	}

	public static String setimoArray(double[] array, double max, double min) {
		int valores = 0;
		String nome = "";

		for (int i = 0; i < array.length; i++) {
			double numeros = (Math.random() * 5 - 1 + 1.0) + 1.0;
			array[i] = numeros;
			if (array[i] >= min && array[i] <= max) {
				valores++;
				nome = nome + array[i];
			}
		}
		return nome;

	}

	public static int oitavoArray(double[] array, double max, double min) {
		int cont = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min || array[i] > max) {
				cont++;
			}
		}
		return cont;
	}

	public static int nonoArray(char[] array, char x, char y) {
		int cont = 0;
		for (int i = 0; i < array.length; i++) {
			
			if(array[i] < x || array[i] > y) {
				cont++;
			}
			
		}

		return cont;
	}
}

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random r = new Random();
		int b = r.nextInt(10);
		System.out.println("Alex: " + b);
		char[] caracter = new char[5];
		int[] array0 = new int[] { 1, 2, 3, 4, 5 };
		int valorX = 1;
		int valorY = 10;
		int valorK = 7;
		double max = 2.0, min = 1.0;
		double[] array1 = new double[r.nextInt(5) + 1];
		
		for(int i = 0; i < array1.length; i++) {
			array1[i] = (Math.random() * (max - min)) + min;
		}

		System.out.println("Q1. " + ExerciciosMetodos.imprimeArray(array0));
		System.out.println("Q2. " + ExerciciosMetodos.invertidoArray(array0));
		System.out.println("Q3. " + ExerciciosMetodos.paresArray(array0));
		System.out.println("Q4. " + ExerciciosMetodos.imparesArray(array0));
		System.out.println("Q5. " + ExerciciosMetodos.trasFrenteArray(array0));
		System.out.println("Q6. " + ExerciciosMetodos.quintoArray(array0, valorX, valorY, valorK));
		System.out.println("Q7. " + ExerciciosMetodos.setimoArray(array1, max, min));
		System.out.println("Q8. " + Arrays.toString(array1) + "\n" + ExerciciosMetodos.oitavoArray(array1, max, min));
	}

}

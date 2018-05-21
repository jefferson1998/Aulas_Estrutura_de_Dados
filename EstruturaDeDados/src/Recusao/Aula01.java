package Recusao;

import java.util.Random;

public class Aula01 {
	public static void q1recusao(int [] a) {
		q1recusao(a, 0);
	}
	
	public static void q1recusao(int []a , int i) {
		if(i < a.length) {
			System.out.println(a[i]);
			q1recusao(a, 1 + i);
		}
	}
	
	
	public static void q2recusao(int []a, int indice) {
		if(indice > 0) {
			System.out.println(a[indice - 1]);
			q2recusao(a, indice - 1);
		}
	}
	
	public static void q2recusao(int []a) {
		q2recusao(a, a.length);
	}
	
	public static void q3recusao(int []a, int indice) {
		if(indice < a.length) {
			if(a[indice] % 2 == 0) {
				System.out.println(a[indice]);
			}
			q3recusao(a, indice + 1);
		}
	}
	
	public static void q3recussao(int []a) {
		q3recusao(a, 0);
	}
	
	public static void q4recussao(int []a, int indice) {
		if(indice < a.length) {
			if(a[indice] % 2 == 1) {
				System.out.println(a[indice]);
			}
			q4recussao(a, indice + 1);
		}
	}
	
	public static void q4recussao(int []a) {
		q4recussao(a, 0);
	}
	
	public static void q5recussao(int []a) {
		q5recussao(a, 0);
	}
	
	public static void q5recussao(int []a, int indice) {
		if(indice < a.length) {
			System.out.println(a[a.length - indice - 1]);
			q5recussao(a, indice + 1);
		}
	}
	
	public static int q6recussao(int x, int y, int n, int k) {
		return q6recussao(n, x, y, k, 0, 0);
	}
	
	public static int q6recussao(int n, int x, int y, int k,int indice, int cont) {
		if(indice < n) {
			int v = new Random().nextInt(y - x + 1) + x;
			
			if(v == k) {
				cont++;
			}
			return q6recussao(n, x, y, k, indice +1, cont);
		}
		
		return cont;	
	}
	
	public static int q7recussao(int []a) {
		return q7recussao(a, 0, 0);
	}
	
	public static int q7recussao(int []a, int cont, int indice) {
		if(indice < a.length) {
			cont += a[indice];
			return q7recussao(a, cont, ++indice);
		}
		return cont;
	}
	
	public static int q8recussao(int a, double x, double y, int indice, int cont) {
		if(indice < a) {
			double n = (Math.random() * (y - x)) + x;
			if(n >= x && n <= y) {
				cont++;
				return q8recussao(a, x, y, indice + 1, cont);
			}
		}
		return cont;
	}
	
	public static int q8recussao(int a, double x, double y) {
		return q8recussao(a, x, y, 0, 0);
	}
	
	public static int q9recussao(int a, double x, double y, int indice, int cont) {
		if(indice < a) {
			double n = (Math.random() * (y - x)) + x;
			if(n < x || n > y) {
				cont++;
				return q9recussao(a, x, y, indice + 1, cont);
			}
		}
		return cont;
	}
	
	public static int q9recussao(int a, double x, double y) {
		return q9recussao(a, x, y, 0, 0);
	}
	
	public static int q10recussao(char []arrayChar, char x, char y, int indice, int cont) {
		if(indice < arrayChar.length) {
			if(arrayChar[indice] < x || arrayChar[indice] > y) {
					cont++;
					return q10recussao(arrayChar, x, y, ++indice, cont);
			}
		}
		return cont;
	}
	
	public static int q10recussao(char[] arrayChar, char x, char y) {
		return q10recussao(arrayChar, x, y, 0, 0);
	}
	
	

	public static void main(String[] args) {
		int a[] = new int [] {1,2,3,4,5};
		int b [] = new int [10];
		Random r = new Random();
		for(int i = 0; i < b.length; i++) {
			b[i] = r.nextInt(10) + 1;
		}
		char [] arrayChar = new char [] {'a','b','c','d','e'};
		
		q1recusao(a);
		q2recusao(a);
		q3recussao(a);
		q4recussao(a);
		q5recussao(a);
		System.out.println(q6recussao(1, 10, 100, 2));
		System.out.println(q7recussao(a));
		System.out.println(q8recussao(250, 5, 4.9));
		System.out.println(q9recussao(250, 5, 4.9));
		System.out.println(q10recussao(arrayChar, 'z', 'y'));
		
		
		
		
		
	}
}

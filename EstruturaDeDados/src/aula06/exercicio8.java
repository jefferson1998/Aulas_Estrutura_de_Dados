package aula06;


public class exercicio8 {
	public static String retorna (String n1, String n2) {
		char[] palavra1 = n1.toCharArray();
		char[] palavra2 = n2.toCharArray();
		String mostrar = "";
		
		for(int i = 0; i < palavra1.length; i++) {
			boolean achou = false;
			for(int j = 0; j < palavra2.length; j++){
				if(palavra1[i] == palavra2[j]) {
					achou = true;
					break;
				}
			}
			if(!achou)
				mostrar += palavra1[i];
		}
		
		return mostrar;
	}
	
	public static void main(String[] args) {
		String n1 = "abacaxi";
		String n2 = "bcx";
		
		System.out.println(retorna(n1, n2));
	}
}

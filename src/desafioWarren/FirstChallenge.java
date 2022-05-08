package desafioWarren;

import java.util.ArrayList;

public class FirstChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Lembrar que 0 + 0 não é um input aceitavel.

		System.out.println(NumerosImpares());

	}
	
	public static String NumerosImpares() {
		String numbersWithSpace = "";
		int limite = 1000000;
		int count = 0;
		ArrayList<Integer> resultados = new ArrayList<Integer>();

		for (int i = 0; i < limite; i++) {
			if (i < 10) {

			} else {
				String reverseValue = new StringBuilder(String.valueOf(i)).reverse().toString();

				Integer result = Integer.parseInt(reverseValue) + i;
				if (result % 2 != 0) {
					if (resultados.contains(result)) {

					} else {
						if (reverseValue.startsWith("0")) {
							
						} else {
//							String convertedValue = new StringBuilder(result).toString();
							resultados.add(result);
							numbersWithSpace += i + " \n";
							count++;
						}
					}
				}
			}
		}

		return numbersWithSpace;
	}

}

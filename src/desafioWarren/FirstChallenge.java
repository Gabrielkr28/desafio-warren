package desafioWarren;

public class FirstChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Lembrar que 0 + 0 não é um input aceitavel.
		
		System.out.println(NumerosImpares());

	}

	/*
	 * Fazer Array com todos os valores e comparar quando aparecer o inverso dele
	 * Para não ocorrer o problema de ele aparecer duplicado (No caso o iverso dele)
	 * 
	 * 
	 * Verificar também sempre que o inverso começar com 0, negar a soma e prosseguir
	 * Pois não é um operação valida
	 * 
	 * */
	
	public static String NumerosImpares() {
		String numbersWithSpace = "";
		int limite = 1000;
		int count = 0;

		for (int i = 0; i < limite; i++) {
			if (i < 10) {

			} else {
				String presentValue = new StringBuilder(String.valueOf(i)).reverse().toString();
				int result = Integer.parseInt(presentValue) + i;
				if (result % 2 != 0) {
					numbersWithSpace += i + " \n";
					count++;
				}
			}
		}

		return numbersWithSpace;
	}

}

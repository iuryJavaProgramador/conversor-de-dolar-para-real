package project1;

import java.util.Scanner;

public class ConversorDeMoedasParaReal {

	public static void main(String[] args) {
		

		try (Scanner scan = new Scanner(System.in)) {
		
			System.out.println("Entre com a quantidade de dolar");
			double qntDolar = scan.nextDouble();
			System.out.println("Entre com a cotacao do dolar");
			double cotacaoDolar = scan.nextDouble();
			
			System.out.println("Entre com a quantidade de euro");
			double qntEuro = scan.nextDouble();
			System.out.println("Entre com a cotacao do euro");
			double cotacaoEuro = scan.nextDouble();
			
			System.out.println("Entre com a quantidade de libra");
			double qntLibra = scan.nextDouble();
			System.out.println("Entre com a cotacao da libra");
			double cotacaoLibra = scan.nextDouble();
			
			int multiplicacao = (int) (qntDolar*cotacaoDolar);
			int multiplicacao1 = (int) (qntEuro*cotacaoEuro);
			int multiplicacao2 = (int) (qntLibra*cotacaoLibra);
			
			System.out.println("O valor da conversao de dolar para real é: " + qntDolar*cotacaoDolar);
			System.out.println("O valor da conversao de euro para real é: " + qntEuro*cotacaoEuro);
			System.out.println("O valor da conversao de libra para real é: " + qntLibra*cotacaoLibra);
		

	}

}
}

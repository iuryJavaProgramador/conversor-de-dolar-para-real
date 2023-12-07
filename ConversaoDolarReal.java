package iury.project;

import java.util.Scanner;

public class ConversaoDolarReal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Entre com a quantidade de dolar");
		double qntDolar = scan.nextDouble();
		
		System.out.println("Entre com a cotacao do dolar");
		double cotacaoDolar = scan.nextDouble();
		
		int multiplicacao = (int) (qntDolar*cotacaoDolar);
		
		
		System.out.println("O valor da conversao de dolar para real é: " + qntDolar*cotacaoDolar);
		
	
		
		}
		
		
		
		
	
		
		

	}



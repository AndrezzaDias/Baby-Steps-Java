package calcula.dora;

import java.util.Scanner;

public class CalculadoraObj {
	static Scanner  opcao = new Scanner (System.in);
	public static void main(String[] args) {
		 
		int butao = 5;
		
		calculadora01 c  = new calculadora01();
		
		 System.out.println("~~ Calculadora ~~");
		 System.out.println   ("1.Soma");
		 System.out.println   ("2.Subtra��o");
		 System.out.println   ("3.Multiplica��o");
		 System.out.println   ("4.Divis�o");
		
		 
		 
		
		 butao = opcao.nextInt();
		 int num1 = opcao.nextInt();
		 int num2 = opcao.nextInt();
		 
		 
		 
		 while(butao != 0) {
			 if (butao == 1) {
				 int valor = c.soma(num1, num2);
				 System.out.println("Resultado da Soma: " + valor);
				 break;
			 }
			 if(butao == 2) {
				 int valor = c.sub(num1, num2);
				 System.out.println("Resultado da Subitra��o: " + valor);
				 break;
			 
		 }
			 if(butao == 3) {
				 int valor = c.mult(num1, num2);
				 System.out.println("Resultado da Multiplica��o: " + valor);
				 break;
		 }
			 if(butao == 4) {
				 int valor = c.div(num1, num2);
				 System.out.println("Resultado da Divis�o: " + valor);
				 break;
		 }
 }
		
	}

	

}

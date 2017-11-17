package bloque4ejercicio0;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Diseñar programa con métodos que saque el máximo
		
		
		int numero1, numero2;
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduzca el primer número");
		numero1=sc.nextInt();
		System.out.println("Introduzca el segundo número");
		numero2=sc.nextInt();
		mayor(numero1,numero2);
	}

	public static void mayor (int num1, int num2) {
		
	int max;
		if (num1<num2)
			max=num2;
		
		else
			max=num1;
		
		System.out.println("El mayor es el " +max);

	}
}

package Teste_2;

import java.util.Scanner;

public class Fibonacci {
	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Informe um número: ");
	    int num = scan.nextInt();
	    scan.close();

	    int a = 0, b = 1, c = 0;
	    while (c <= num) {
	      c = a + b;
	      a = b;
	      b = c;

	      if (c == num) {
	        System.out.println(num + " pertence à sequência de Fibonacci");
	        return;
	      }
	    }
	    System.out.println(num + " não pertence à sequência de Fibonacci");
	  }
	}
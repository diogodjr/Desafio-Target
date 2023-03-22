package Teste_5;

import java.util.Scanner;

public class ReverterString {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Informe uma string: ");
	    String input = scan.nextLine();
	    scan.close();

	    StringBuilder reversed = new StringBuilder();
	    for (int i = input.length() - 1; i >= 0; i--) {
	      reversed.append(input.charAt(i));
	    }

	    System.out.println("A string invertida é: " + reversed.toString());
	  }
	}
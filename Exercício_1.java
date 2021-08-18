package Exercícios;

import java.util.Scanner;

public class Exercício_1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String name = entrada.nextLine();
        System.out.println("Informe seu salário: ");
        Double sal = entrada.nextDouble();
        
        Double desconto = 0.00;
        Double salFinal = 0.00;
        
        if (sal >= 0.00 && sal <= 1100.00 ) {
        	desconto = (sal * 7.5) / 100;
        	salFinal = sal - desconto;
        }
        else if (sal > 1100.00 && sal <= 2203.48 ) {
        	desconto = (sal * 9) / 100;
        	salFinal = sal - desconto;
        }
        else if (sal > 2203.48 && sal <= 3305.22 ) {
        	desconto = (sal * 12) / 100;
        	salFinal = sal - desconto;
        }
        else if (sal > 3305.22 && sal <= 6433.57 ) {
        	desconto = (sal * 14) / 100;
        	salFinal = sal - desconto;
        }
        System.out.println("Nome: " + name);
        System.out.println("Salário Bruto: R$ " + sal);
        System.out.println("INSS: R$ " + desconto);
        System.out.println("Salário Líquido: R$ " + salFinal);
	}

}

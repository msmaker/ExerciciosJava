import java.util.Scanner;

import entities.Retangulo;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		System.out.print("Digite a altura do retangulo: ");
		retangulo.altura = sc.nextDouble();
		System.out.print("Digite a base do retangulo: ");
		retangulo.base = sc.nextDouble();
		
		System.out.println();
		
		System.out.println(retangulo);
		
	}

}

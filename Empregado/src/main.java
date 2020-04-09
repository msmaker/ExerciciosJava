import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Empregados empregado = new Empregados();
		
		System.out.println("Digite o nome do funcionario: ");
		empregado.nome = sc.nextLine();
		System.out.println("Digite o salario do funcionario: ");
		empregado.salarioBruto = sc.nextDouble();
		System.out.println("Digite a taxa: ");
		empregado.taxa = sc.nextDouble();
		
		System.out.println();
		
		System.out.println(empregado);
		
		System.out.println("Digite o a % de aumento ");
		empregado.aumentoDeSalario(sc.nextDouble());
		
		System.out.println();
		
		System.out.println(empregado);
	
		

	}

}

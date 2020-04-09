
public class Empregados {

	public String nome;
	public double salarioBruto;
	public double taxa;

	public double salarioLiquido() {
		return salarioBruto - taxa;
	}

	public void aumentoDeSalario(double porcentagem) {
		salarioBruto = salarioBruto + (salarioBruto * porcentagem / 100);

	}

	public String toString() {
		return "Funcionario: " + nome + "\nSalario: R$" + String.format("%.2f",salarioLiquido());
	}
}

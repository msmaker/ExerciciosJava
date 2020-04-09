package entities;

public class Notas {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;

	public void MediaFinal() {
		double nota = nota1 + nota2 + nota3;
		if (nota >= 60) {
			System.out.println("Nota final = " + String.format("%.2f", nota));
			System.out.println("Aprovado");
		} else {
			System.out.println("Nota final = " + String.format("%.2f", nota));
			System.out.println("Reprovado");
			System.out.println("Faltando " + String.format("%.2f", (60 - nota)) + " pontos");
		}
	}

}

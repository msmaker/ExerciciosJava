package entities;

public class Retangulo {

	public double altura;
	public double base;

	public double area() {

		return base * altura;
	}

	public double perimetro() {

		return 2 * (altura + base);
	}

	public double diagonal() {

		return Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));
	}

	public String toString() {
		return "Area: " 
			+ String.format("%.2f",area()) 
			+ "\nPerimetro: " + String.format("%.2f",perimetro()) 
			+ "\nDiagonal: " + String.format("%.2f",diagonal());
	}

}

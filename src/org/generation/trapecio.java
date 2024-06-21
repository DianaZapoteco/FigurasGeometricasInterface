package org.generation;

public class trapecio implements figuraGeometrica{
	private String nombre;
	private double lado1;
	private double lado2;
	private double lado3;
	private double lado4;
	private double BaseMayor;
	private double BaseMenor;
	private double Altura;
	public trapecio(String nombre, double lado1, double lado2, double lado3, double lado4, double BaseMayor, double BaseMenor, double Altura ) {
		this.nombre = nombre;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
		this.BaseMayor = BaseMayor;
		this.BaseMenor = BaseMenor;
		this.Altura = Altura;
	}//constructor
	
	public double calcularArea() {
		return (Altura*(BaseMayor*BaseMenor))/2;
	}//calculadoraArea
	
	public double calcularPerimetro() {
		return (lado1+lado2+lado3+lado4);
	}//calculadoraPerimetro
	
	public String getNombre() {
		return nombre;
	}//getName
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre
	public double lado1() {
		return lado1;
	}
	public void setlado1(double lado1) {
		this.lado1 = lado1;
	}
	public double getlado2() {
		return lado2;
	}
	public void setlado2(double lado2) {
		this.lado2 = lado2;
	}
	public double getlado3() {
		return lado3;
	}
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
	public double getLado4() {
		return lado4;
	}
	public void setLado4(double lado4) {
		this.lado4 = lado4;
	}
	public double getBaseMayor() {
		return BaseMayor;
	}
	public void setBaseMayor(double baseMayor) {
		BaseMayor = baseMayor;
	}
	public double getBaseMenor() {
		return BaseMenor;
	}
	public void setBaseMenor(double baseMenor) {
		BaseMenor = baseMenor;
	}
	public double getAltura() {
		return Altura;
	}
	public void setAltura(double altura) {
		Altura = altura;
	}
	
	@Override
	public String toString() {
		return "trapecio [nombre=" + nombre + ", lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", lado4="
				+ lado4 + ", BaseMayor=" + BaseMayor + ", BaseMenor=" + BaseMenor + ", Altura=" + Altura + "]";
	}	

}

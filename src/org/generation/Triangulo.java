package org.generation;

public class Triangulo implements figuraGeometrica{
	private String nombre;
	private double base;
	private double altura;
	private double lado;
	public Triangulo(String nombre, double base, double altura, double lado) {
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
		this.lado = lado;
	}//constructor
	
	public double calcularArea() {
		return (base*altura)/2;
	}//calculadoraArea
	
	public double calcularPerimetro() {
		return (lado+lado+lado);
	}//calculadoraPerimetro
	
	public String getNombre() {
		return nombre;
	}//getName
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre
	public double getBase() {
		return base;
	}//getBase
	public void setBase(double base) {
		this.base = base;
	}//setBase
	public double getAltura() {
		return altura;
	}//getAltura
	public void setAltura(double altura) {
		this.altura = altura;
	}//setAltura
	public double getLado() {
		return lado;
	}//getLado
	public void setLado(double lado) {
		this.lado = lado;
	}//setLado
	@Override
	public String toString() {
		return "Triangulo [nombre=" + nombre + ", base=" + base + ", altura=" + altura + ", lado=" + lado + "]";
	}
	
}//triangulo
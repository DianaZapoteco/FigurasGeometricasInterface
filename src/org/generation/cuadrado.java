package org.generation;

public class cuadrado implements figuraGeometrica{
	private String nombre;
	private double lado;
	public cuadrado(String nombre, double lado) {
		this.nombre = nombre;
		this.lado = lado;
	}//constructor
	
	public double calcularArea() {
		return lado*lado;
	}//calculadoraArea
	
	public double calcularPerimetro() {
		return (lado+lado+lado+lado);
	}//calculadoraPerimetro
	
	public String getNombre() {
		return nombre;
	}//getName
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre
	public double getLado() {
		return lado;
	}//getLado
	public void setLado(double lado) {
		this.lado = lado;
	}//setLado
	@Override
	public String toString() {
		return "cuadrado [nombre=" + nombre + ", lado=" + lado + "]";
	}
		

}//cuadrado

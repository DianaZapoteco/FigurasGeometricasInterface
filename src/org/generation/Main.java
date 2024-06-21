package org.generation;

public class Main {
	public static void main(String[] args) {
		Triangulo bermudas= new Triangulo ("Bermudas", 20, 10, 15);
		Triangulo t =new Triangulo("TrianguloTe", 250, 175, 145);
		cuadrado a = new cuadrado ("a",35);
		Rectangulo b = new Rectangulo("b", 25, 32);
		Rombo c = new Rombo("c", 12, 21, 32);
		romboide d = new romboide("d", 23, 19);
		trapecio e = new trapecio("e", 12, 16, 17, 21, 32, 24, 16);
		imprimirCalculo(bermudas);
		imprimirCalculo(t);
		imprimirCalculo(a);
		imprimirCalculo(b);
		imprimirCalculo(c);
		imprimirCalculo(d);
		imprimirCalculo(e);
		
	}//main
	
	
	public static void imprimirCalculo (figuraGeometrica f) {
		System.out.println(f.toString());
		System.out.println("+=======================");
		System.out.println("|El area de [" + f.getNombre()
				+ "] es : " + f.calcularArea());
		System.out.println("|El perimitro de [" + f.getNombre()
				+ "] es : " + f.calcularPerimetro());
		System.out.println("+=======================");
	}//imprimirCalculo
	
}//lass

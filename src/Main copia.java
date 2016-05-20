package fila;

public class Main {

	public static void main(String[] args){
		Fila fila=new Fila();
		
		fila.agregar("Hola");
		fila.agregar("como");
		fila.agregar("estas");
		
		fila.listar();
		
		Nodo n=fila.getNodo(2);
		
		System.out.println(n);
		
		Nodo n=fila.getNodo(10);
		
		System.out.println(n);
		
		Nodo l=fila.getNodo(3);
		
		System.out.println(l.dato);
		
		Nodo k=fila.getNodo(4);
		
		System.out.println(k.dato);
		
	}
	
	
}

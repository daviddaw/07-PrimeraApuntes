package Soluciones.ExamenParte1;

import java.util.Scanner;

public class PrincipalArticulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String continuar;
		Articulo articulo;	
		
		String nombre, categoria ;
		double precio,suma=0, media;
		int contador=0;
				
		do {
				System.out.println("Introduce el nombre del articulo");
				nombre=input.next();
				System.out.println("Introduce el precio del articulo");
				precio=input.nextDouble();
				do {
					System.out.println("Introduce la categoria(novedad,temporada,defectuoso o descatalogado)");
					categoria=input.next();
				}
				while (!(categoria.equalsIgnoreCase("novedad") || categoria.equalsIgnoreCase("temporada") || categoria.equalsIgnoreCase("defectuoso")|| categoria.equalsIgnoreCase("descatalogado")));
				//valida que la categoría sea correcta
				articulo = new Articulo(nombre, precio, categoria);
				System.out.println(articulo.toString());
				
				contador++;
				suma+=articulo.precioRebajado();
				System.out.println("¿Desea crear otro articulo? (s/n)");
				continuar = input.next();
				
		}
		while (continuar.equalsIgnoreCase("s"));
		
		media=suma/contador;
		System.out.println("Se han introducido un total de "+contador+" articulos con un precio medio rebajado de "+media);
		
		input.close();
	}

}

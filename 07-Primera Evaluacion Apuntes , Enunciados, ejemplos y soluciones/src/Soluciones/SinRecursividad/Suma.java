package Soluciones.SinRecursividad;

public class Suma {

	
	
	public static void main(String[] args) {

		int numero1, numero2, resultado;
		numero1=introducirNumero();
		numero2=introducirNumero();
		resultado=sumaNumeros(numero1,numero2);
		System.out.println ("la suma de ambos números es "+resultado);
		
		
	}
	
	static int sumaNumeros (int a, int b)
	{
		int suma=0;
		suma=a+b;
		return suma;
	}
	
	static int introducirNumero ()
	{
		int num;
		System.out.println ("Introduce un numero");
		num=LeerTeclado.readInteger();
		return num;
	}
	
	
}

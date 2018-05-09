package Soluciones.SinRecursividad;

public class FactorialNoRecursivo {

	public static void main(String[] args) {
		int n;

		do {
			System.out.println("Introduce el nº para calcular su factorial");
			n = LeerTeclado.readInteger();
		} while (n < 0);

		System.out.println("El factorial de " + n + " es " + factorial(n));

	}
	
	public static double factorial (int x){
		
		double fact=1;
		for (int i=1;i<=x;i++)
			fact*=i;
		return fact;
	}

}

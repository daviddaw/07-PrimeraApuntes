package Soluciones.ConRecursividad;

public class FibonacciRecursivo {

	public static void main(String[] args) {
		int num;
		do{
			System.out.println("Introduce un nº positivo");
			num = LeerTeclado.readInteger();
		}
		while(num<=0);
		
		System.out.println("Los "+num+" primeros números de la serie de Fibonacci son");
		for (int j=1; j<=num;j++)
			System.out.println(fibonacci(j));
		

	}
	public static int fibonacci(int n){
		if (n == 1)
			return 0;
		else if (n == 2)
			return 1;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}
}

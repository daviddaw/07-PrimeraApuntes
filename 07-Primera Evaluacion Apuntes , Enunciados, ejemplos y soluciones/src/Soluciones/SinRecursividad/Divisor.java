package Soluciones.SinRecursividad;

public class Divisor {

	public static void main(String[] args) {
		int a, b;
		System.out.println("introduce a y b");
		a = LeerTeclado.readInteger();
		b = LeerTeclado.readInteger();
		if (b == 0)
			System.out.println("No se puede dividir por cero");
		else if (divisible(a, b))
			System.out.println(a + " es divisible entre " + b);
		else
			System.out.println(a + " no es divisible entre " + b);

	}
	
	static boolean divisible(int a, int b){
		//Se puede hacer:
		
		/*if (a%b==0)
			return true;
		else return false;*/
		
		//o también 
		
		return (a%b==0);
	}

}

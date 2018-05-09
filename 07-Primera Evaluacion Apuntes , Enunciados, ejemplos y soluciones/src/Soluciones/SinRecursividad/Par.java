package Soluciones.SinRecursividad;

public class Par {

	/**
	 * @param args
	 */
	public static boolean par(int num)
	{
		if (num%2==0) 
			return true;
		else return false;
	}
	
	public static int introduceEntero ()
	{	int n;
		do {
			System.out.println ("Introduce un nª positivo");
			n=LeerTeclado.readInteger();		
		}
		while (n<0);
		return n;
	}
	
	public static void main(String[] args) {
		
		int n=introduceEntero();
		if (par(n)==true)
			System.out.println ("El nº "+n+" es par");
		else
			System.out.println ("El nº "+n+" es impar");

	}
	
	

}

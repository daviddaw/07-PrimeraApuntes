package Soluciones.SinRecursividad;

public class ParBis {

	public static void main(String[] args) {
		
		if (par())
			System.out.println ("El n�  es par");
		else
			System.out.println ("El n�  es impar");


	}
	
	public static int introducirNum(){
		{	int x;
		do {
			System.out.println ("Introduce un n� positivo");
			x=LeerTeclado.readInteger();		
		}
		while (x<0);
		return x;
	}
	}
	
	public static boolean par(){
		int x=introducirNum();
		if (x%2==0)
			return true;
		else return false;
	}
	}
	



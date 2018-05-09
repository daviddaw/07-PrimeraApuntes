package Soluciones.SinRecursividad;

public class NumeroMenor {

	public static void main(String[] args) {
		
		int a,b;
		System.out.println("introduce dos números");
		a=LeerTeclado.readInteger();
		b=LeerTeclado.readInteger();
		System.out.println("El menor es "+menor(a,b));
		

	}

	static int menor(int x,int y){
		if (x<=y)
			return x;
		else return y;
	}
}

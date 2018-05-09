package Soluciones.SinRecursividad;

public class Primo {

	public static void main(String[] args) {
		int n, cont=0, x;
		
		do{
		System.out.println ("Introduce el nº mayor que 1");
		n=LeerTeclado.readInteger();
		}
		
		while (n<1);
	
		
		if (primo(n))
			System.out.println ("El "+n+" es primo");
		else 
			System.out.println ("El "+n+" no es primo");

		System.out.println();
		System.out.println("Primos hasta el número "+n);
		if (n==1)
			System.out.println("No hay primos");
		
		else
			for ( x=2; x<=n; x++)
				if (primo(x))
				System.out.println("El número "+x);
		

		System.out.println();
		if (n==1)
			System.out.println("El primer primo es 2");
		else {
			System.out.println("Los "+n+" primeros primos son: ");
			x=2;
			while (cont<n){
				if (primo(x)){
					System.out.println("El número "+x);
					cont++;
				}
				x++;
			}
		
		}
	}

	

	static boolean primo (int x){
		
		boolean primo=true;
		
		if (x==1)
			primo=false;
		else 
			
			for (int div=2; div<=x/2 && primo; div++)
			
				if (x%div==0)
					
					primo=false;
					
			
		
		return primo;

}
}

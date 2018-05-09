package Soluciones.SinRecursividad;

public class NumeroPerfecto {

	public static void main(String[] args) {
		int n;

		do {
			System.out.println("Introduce un nº para obtener todos los números  perfectos menores que él ");
			n = LeerTeclado.readInteger();
		} while (n <= 0);

		for (int i=1;i<=n;i++){ //INVOCAMOS AL PRIMER MÉTODO perfecto1
			
			if (perfecto1(i))
				System.out.println("El nº " + i + " es perfecto");
		}
		System.out.println("____________________");
		//Otra forma usando el método sumaDivisores
		for (int i=1;i<=n;i++){
			if(i==sumaDivisores(i))
				System.out.println("El nº " + i + " es perfecto");	
			
		}

	}
	
	public static boolean perfecto1(int x){ //retorna un boolean que indique si el nº es o no perfecto
		//en el propio método se evalúa si la suma de divisores es igual al nº
		
		int suma=0;	
		for (int i=1;i<=x/2;i++)
				if (x%i==0)
					suma+=i; 
		if (x==suma)
				return true;
			else 
				return false;

	}
	
	//OTRA FORMA PODRÍA HABER SIDO
	
	public static int sumaDivisores(int x){ //retorna solo la suma de los divisores. 
		//En el main se evalúa si dicha suma es igual al nº
			
			int suma=0;	
			for (int i=1;i<=x/2;i++)
					if (x%i==0)
						suma+=i; 
			return suma; //
	
		}

}

package Soluciones.SinRecursividad;

public class NumeroPerfecto {

	public static void main(String[] args) {
		int n;

		do {
			System.out.println("Introduce un n� para obtener todos los n�meros  perfectos menores que �l ");
			n = LeerTeclado.readInteger();
		} while (n <= 0);

		for (int i=1;i<=n;i++){ //INVOCAMOS AL PRIMER M�TODO perfecto1
			
			if (perfecto1(i))
				System.out.println("El n� " + i + " es perfecto");
		}
		System.out.println("____________________");
		//Otra forma usando el m�todo sumaDivisores
		for (int i=1;i<=n;i++){
			if(i==sumaDivisores(i))
				System.out.println("El n� " + i + " es perfecto");	
			
		}

	}
	
	public static boolean perfecto1(int x){ //retorna un boolean que indique si el n� es o no perfecto
		//en el propio m�todo se eval�a si la suma de divisores es igual al n�
		
		int suma=0;	
		for (int i=1;i<=x/2;i++)
				if (x%i==0)
					suma+=i; 
		if (x==suma)
				return true;
			else 
				return false;

	}
	
	//OTRA FORMA PODR�A HABER SIDO
	
	public static int sumaDivisores(int x){ //retorna solo la suma de los divisores. 
		//En el main se eval�a si dicha suma es igual al n�
			
			int suma=0;	
			for (int i=1;i<=x/2;i++)
					if (x%i==0)
						suma+=i; 
			return suma; //
	
		}

}

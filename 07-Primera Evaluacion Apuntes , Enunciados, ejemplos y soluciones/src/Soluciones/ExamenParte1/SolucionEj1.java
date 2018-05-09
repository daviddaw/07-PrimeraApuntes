package Soluciones.ExamenParte1;

public class SolucionEj1 {

	public static void main(String[] args) {
		
		//rellenar el array de pa�ses con los datos que nos dan
		String[] paises= {"Espa�a","Francia","Reino Unido","Italia","Alemania","Dinamarca"};
		
		int[] puntos=new int[6];
		
		//rellenar el array de puntos aleatoriamente
		for (int i = 0; i < puntos.length; i++) {
			puntos[i]=(int)(Math.random()*10+1);			
		}
		
		//imprimir
		System.out.println("Las puntuaciones de cada pa�s son: ");
		for (int i = 0; i < puntos.length; i++) {
			System.out.println( paises[i]+": "+puntos[i]);
		}
		
		int primero=Integer.MIN_VALUE, segundo=Integer.MIN_VALUE;		
		String paisPrimero="", paisSegundo=""; 
		
		for (int i = 0; i < puntos.length; i++) {			
			if (primero<puntos[i]) {
				segundo=primero;
				primero=puntos[i]; 
			}
			if(segundo<puntos[i] && puntos[i]<primero) 
				segundo=puntos[i];
				
		}
		
		//Otra opci�n: buscar primero el m�ximo y luego el segundo 
		for (int i = 0; i < puntos.length; i++) {
				if (primero<puntos[i]) 
				primero=puntos[i]; 
		}
		
		for (int i = 0; i < puntos.length; i++) {
			if(segundo<puntos[i] && puntos[i]<primero)
				segundo=puntos[i];
		}
		
		
		
		//recorrer para imprimir todos los pa�ses con la misma puntuaci�n para no tener que 
		//hacer dos for uno para buscar el primero y otro para
		//el segundo, concatenamos todos los pa�ses en el string de salida correspondiente
		for (int i = 0; i < puntos.length; i++) {
			if (puntos[i]==primero)
				paisPrimero+=" "+paises[i]; //a�adimos al string el pa�s que acabamos de encontrar
			
				if (puntos[i]==segundo) //�dem
				paisSegundo+=" "+paises[i];
		}
			
			
		System.out.println("El primer premio con "+primero+" puntos es para "+paisPrimero);
		System.out.println("El segundo premio con "+segundo+" puntos es para "+paisSegundo);
	}

}

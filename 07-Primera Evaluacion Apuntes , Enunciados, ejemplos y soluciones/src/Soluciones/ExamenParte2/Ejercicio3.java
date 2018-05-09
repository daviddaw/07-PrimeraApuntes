package Soluciones.ExamenParte2;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner (System.in);
		int intentos=0; //Cuenta el número de intentos
		//se puede usar un array de boolean para saber si el número ya está introducido o un array de int
		
		
		boolean [] numMetidos=new boolean [10]; //Array para saber qué números he metido (todo al principio está en false)
		int [] numMetidos2=new int [10]; //también se puede hacer con el array de int
		
		boolean encontrado=false; //controla si he encontrado el número
		boolean mintiendo=false; //Ídem mientiendo
		int contadorNumeros=0; //cuenta si se han introducido todos los números (no es necesario)
		
		while ((encontrado== false && mintiendo==false )) { //El bucle da vueltas mientras no se haya encontrado y mintiendo sea falso 
			int numNuevo=(int) (Math.random()*10+1); //Se genera un número aleatorio
			
			if (numMetidos [numNuevo-1]==false) { //Controlo que no esté repetido viendo que la posición de ese número en el array es falso
				//también puedo preguntar :
			//if numMetidos2 [numNuevo-1]!=0) {
				System.out.println("¿Es tu número el "+ numNuevo + "?");
				intentos++; //Incrememento el número de intentos
				encontrado=input.nextBoolean(); //Pregunto si la respuesta fuera true se saldría
				
				if (encontrado==false) { 
					//Si la respuesta es false se guarda el nº en el array (se pone a true en el array de boolean o se guarda en el array de int
					numMetidos [numNuevo-1]=true; 
					// También: 
					//numMetidos[numNuevo-1]=numNuevo;
					
					//para ver si ya hemos usado todos los números podemos recorrer todo el array para ver si está lleno o usar un contador
					contadorNumeros++; //no es necesario
					mintiendo=buscarArrayLleno (numMetidos); //miramos si todas las posiciones son true (o están ocupadas en el array de int)
					//tambien podemos hacer 
					if (contadorNumeros==10)
						mintiendo=true;
				}
			}
		}
		if (mintiendo==true)
			System.out.println("Estás mintiendo, he intentado todos los números");
		else System.out.println("Enhorabuena");
		System.out.println("El número de intentos es de "+intentos);
		input.close();
}


public static boolean buscarArrayLleno (boolean [] a) {
	for (int i=0; i<a.length; i++) {
		if (a[i]==false) // También if(a[i]==0)
			return false;
	}
	return true;
}

}	
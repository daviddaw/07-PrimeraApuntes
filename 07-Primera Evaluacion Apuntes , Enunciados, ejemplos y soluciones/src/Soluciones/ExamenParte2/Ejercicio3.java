package Soluciones.ExamenParte2;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner (System.in);
		int intentos=0; //Cuenta el n�mero de intentos
		//se puede usar un array de boolean para saber si el n�mero ya est� introducido o un array de int
		
		
		boolean [] numMetidos=new boolean [10]; //Array para saber qu� n�meros he metido (todo al principio est� en false)
		int [] numMetidos2=new int [10]; //tambi�n se puede hacer con el array de int
		
		boolean encontrado=false; //controla si he encontrado el n�mero
		boolean mintiendo=false; //�dem mientiendo
		int contadorNumeros=0; //cuenta si se han introducido todos los n�meros (no es necesario)
		
		while ((encontrado== false && mintiendo==false )) { //El bucle da vueltas mientras no se haya encontrado y mintiendo sea falso 
			int numNuevo=(int) (Math.random()*10+1); //Se genera un n�mero aleatorio
			
			if (numMetidos [numNuevo-1]==false) { //Controlo que no est� repetido viendo que la posici�n de ese n�mero en el array es falso
				//tambi�n puedo preguntar :
			//if numMetidos2 [numNuevo-1]!=0) {
				System.out.println("�Es tu n�mero el "+ numNuevo + "?");
				intentos++; //Incrememento el n�mero de intentos
				encontrado=input.nextBoolean(); //Pregunto si la respuesta fuera true se saldr�a
				
				if (encontrado==false) { 
					//Si la respuesta es false se guarda el n� en el array (se pone a true en el array de boolean o se guarda en el array de int
					numMetidos [numNuevo-1]=true; 
					// Tambi�n: 
					//numMetidos[numNuevo-1]=numNuevo;
					
					//para ver si ya hemos usado todos los n�meros podemos recorrer todo el array para ver si est� lleno o usar un contador
					contadorNumeros++; //no es necesario
					mintiendo=buscarArrayLleno (numMetidos); //miramos si todas las posiciones son true (o est�n ocupadas en el array de int)
					//tambien podemos hacer 
					if (contadorNumeros==10)
						mintiendo=true;
				}
			}
		}
		if (mintiendo==true)
			System.out.println("Est�s mintiendo, he intentado todos los n�meros");
		else System.out.println("Enhorabuena");
		System.out.println("El n�mero de intentos es de "+intentos);
		input.close();
}


public static boolean buscarArrayLleno (boolean [] a) {
	for (int i=0; i<a.length; i++) {
		if (a[i]==false) // Tambi�n if(a[i]==0)
			return false;
	}
	return true;
}

}	
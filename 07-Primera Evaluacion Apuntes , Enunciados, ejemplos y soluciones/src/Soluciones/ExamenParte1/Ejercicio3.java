package Soluciones.ExamenParte1;
//ejercicio de Iván Rodríguez con algunos arreglos 
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner S = new Scanner(System.in);
		int n;
		System.out.println("Introduce un limite:");
		n = S.nextInt();
		
		if(impar(n)==true) {
			System.out.println(sumaDeEnterosHastaN(n));
		}
		else {
			System.out.println(sumaDeEnterosHastaN(n-1));
		}
		
		S.close();
	}

	public static int sumaDeEnterosHastaN(int n) {
		
		if(n==1) {
			//System.out.print(n);
			return n;
		}
		else {
			return n+sumaDeEnterosHastaN(n-2);
		//	System.out.print(n);
		}
	}

	public static boolean impar(int a) {
		boolean impar = true;
		if(a%2==0) {
			impar = false;
		}
		return impar;
	}
}



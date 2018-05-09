package Soluciones.ConRecursividad;

public class PasarABinarioRecursivo {

	public static void main(String[] args) {
		int n;
		System.out.println("Introduce un nº");
		n = LeerTeclado.readInteger();
		System.out.println("El nº en binario es: ");
		cifraBinaria(n);

	}

	public static void cifraBinaria(int i){
		if (i < 2) {
			System.out.print(i);	
		}
		else {
			cifraBinaria(i/2);
			System.out.print(i % 2);
			
		}
	}
	
		
}

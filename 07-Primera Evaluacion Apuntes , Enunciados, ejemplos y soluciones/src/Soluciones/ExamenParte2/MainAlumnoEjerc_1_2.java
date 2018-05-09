package Soluciones.ExamenParte2;


public class MainAlumnoEjerc_1_2 {

	public static void main(String[] args) {
		int dia=10,mes=3,año=2000,sumasuerte=0;
		String yo="Alumno";
		for(int i=1;i<=10;i++){
			Alumno a1=new Alumno(yo+i,dia++,mes++,año++);
			System.out.println();
			System.out.println(a1.toString());
			System.out.println("Numero de la suerte recursivo "+a1.suerteRecursivo(a1.getDianac()+a1.getMesnac()+a1.getAnnonac()));
			
			sumasuerte=sumasuerte+a1.numeroSuerte();
		}
		System.out.println();
		System.out.println("La suma de todos los números de la suerte es "+sumasuerte);
	}
}

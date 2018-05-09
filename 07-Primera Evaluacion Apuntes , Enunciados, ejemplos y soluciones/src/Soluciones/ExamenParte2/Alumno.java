package Soluciones.ExamenParte2;
//Ejercicio Antonio con algunos arreglos

public class Alumno {
	private int codigo;
	private String nombre;
	private int dianac;
	private int mesnac;
	private int annonac;
	private static int contador;
	

	Alumno(String nombre, int dianac, int mesnac, int añonac){
		this.nombre=nombre;
		this.dianac=dianac;
		this.mesnac=mesnac;
		this.annonac=añonac;
		contador++;
		codigo=contador;
	}
	
	public int getCodigo(){
		return codigo;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public int getDianac(){
		return dianac;
	}
	
	public int getMesnac(){
		return mesnac;
	}
	
	public int getAnnonac(){
		return annonac;
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public void setDianac(int dianac){
		this.dianac=dianac;
	}
	
	public void setMesnac(int mesnac){
		this.mesnac=mesnac;
	}
	
	public void setAnnonac(int annonac){
		this.annonac=annonac;
	}
	
	public int numeroSuerte(){
		int suma=dianac+mesnac+annonac;
		int cifra,numsuerte=0;
		while(suma>0){
			cifra=suma%10;
			suma=suma/10;
			numsuerte=numsuerte+cifra;
		}
		return numsuerte;		
	}
	
	public  int suerteRecursivo(int suma){
		
		if (suma<10) {
			
			return suma;
		}
		//System.out.print(suma%10);
		//return suerteRecursivo(suma/10);
		return suma%10+suerteRecursivo(suma/10);
	}
	
	public boolean equals(String nombre, int dianac, int mesnac, int añonac){
		if (this.numeroSuerte()==numeroSuerte()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Codigo= " + getCodigo() + " Nombre= "
				+ getNombre() + " Dia= " + getDianac()
				+ " Mes= " + getMesnac() + " Año= "
				+ getAnnonac() + " numeroSuerte= " + numeroSuerte();
	}
}

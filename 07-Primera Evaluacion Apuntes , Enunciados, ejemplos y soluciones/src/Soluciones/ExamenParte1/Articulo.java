package Soluciones.ExamenParte1;

public class Articulo {
	private static int contador=0; //para el autonumérico
	private int codigo;
	private String nombre;
	private double precio;
	private String categoria;
	
	//constructor
	public Articulo(String nombre, double precio, String categoria) {
		contador++;
		codigo=contador;
		this.nombre = nombre;
		this.precio = precio;
		this.categoria = categoria;
	}
	
	//constructor con articulo
	public Articulo(Articulo articulo) {		
		this.nombre = articulo.nombre;
		this.precio = articulo.precio;
		this.categoria = articulo.categoria;
	}
	
	//No debe haber setCodigo()  porque lo controla el contador
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	 //sí puede haber getCodigo() para ver su valor	
	public int getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	//precioRebajado
	public double precioRebajado() {
		double descuento=1, rebaja;
		
		/*if(categoria.equalsIgnoreCase("novedad") { //cuidado con == y string
			descuento=0.05;
		} else .....*/
		
		//mejor:
		switch(categoria) { 
		case "novedad": descuento=0.05; break;
		case  "temporada": descuento=0.07; break;
		case "defectuoso": descuento=0.2; break;
		case "descatalogado": descuento=0.4;break;
	//	default: descuento=0; //no es necesario si se valida la categoría al crear el objeto
		}
		//si no queréis cambiar el precio
		rebaja=precio*(1-descuento);
		//si queréis cambiar el precio
		//precio-=precio*descuento;
		return rebaja; //o return precio si se ha cambiado
	
	}	
	
	//equals solo de precioRebajado
		public boolean equals(Articulo otroArticulo) {
			return this.precioRebajado()==otroArticulo.precioRebajado(); //si no se ha cambiado el precio
	}

		@Override
		public String toString() {
			return "Articulo [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", categoria="
					+ categoria + ", precioRebajado()=" + this.precioRebajado() + "]";
		}
		
	
	
}

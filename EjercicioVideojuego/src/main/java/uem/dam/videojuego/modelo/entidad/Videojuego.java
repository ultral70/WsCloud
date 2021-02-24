package uem.dam.videojuego.modelo.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//Creamos la tabla en la BBDD
@Entity
public class Videojuego {

	//Hacemos que la BBDD sepa que el id es la primary key
	@Id
	//Autoincremental
	@GeneratedValue
	private int id;
	
	private String nombre;
	private String compania;
	private double precio;
	private double puntos;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCompania() {
		return compania;
	}
	public void setCompania(String compania) {
		this.compania = compania;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getPuntos() {
		return puntos;
	}
	public void setPuntos(double puntos) {
		this.puntos = puntos;
	}
	
	@Override
	public String toString() {
		return "Videojuego [id=" + id + ", nombre=" + nombre + ", compania=" + compania + ", precio=" + precio
				+ ", puntos=" + puntos + "]";
	}
	
}

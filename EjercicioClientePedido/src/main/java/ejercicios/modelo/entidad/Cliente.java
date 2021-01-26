package ejercicios.modelo.entidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Cliente {

	private String nombre;
	private String Apellidos;
	
	@Autowired
	private Pedido pedido;
	
	public Cliente() {
		super();
		this.nombre = "Pepi";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", Apellidos=" + Apellidos + ", pedido=" + pedido + "]";
	}
	
	
	
}

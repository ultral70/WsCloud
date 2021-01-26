package ejercicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import ejercicios.modelo.entidad.Cliente;
import ejercicios.modelo.entidad.Pedido;

@SpringBootApplication
public class EjercicioClientePedidoApplication {

	public static ApplicationContext context;
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioClientePedidoApplication.class, args);
		
		Cliente c1 = context.getBean("cliente", Cliente.class);
		Pedido p1 = context.getBean("pedido", Pedido.class);
		
		p1.setId(1);
		p1.setPrecio(2000);
		
		c1.setNombre("Pipi");
		c1.setApellidos("Estrada");
		c1.setPedido(p1);
		
		System.out.println(p1);
		
	}

}

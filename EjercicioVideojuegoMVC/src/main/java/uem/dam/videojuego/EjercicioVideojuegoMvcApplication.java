package uem.dam.videojuego;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import uem.dam.videojuego.modelo.entidad.Usuario;
import uem.dam.videojuego.modelo.entidad.Videojuego;
import uem.dam.videojuego.modelo.persistencia.DaoUsuario;
import uem.dam.videojuego.modelo.persistencia.DaoVideojuego;

@SpringBootApplication
public class EjercicioVideojuegoMvcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EjercicioVideojuegoMvcApplication.class, args);
		
		//Al ser H2, BBDD en memoria, debemos crear los usuarios al crear la app
		DaoUsuario du = context.getBean("daoUsuario", DaoUsuario.class);
		DaoVideojuego dv = context.getBean("daoVideojuego", DaoVideojuego.class);
		
		Usuario pipo = new Usuario();
		
		pipo.setNombre("Pipo");
		pipo.setPassword("1234");
		
		du.save(pipo);
		
		List<Videojuego> listaJuegos = new ArrayList<>();
		
		Videojuego juego1 = new Videojuego();
		juego1.setNombre("Jaoa");
		juego1.setCompania("PIM");
		juego1.setPrecio(87.9);
		juego1.setPuntos(4.3);
		
		
		listaJuegos.add(juego1);
		
		juego1 = new Videojuego();

		juego1.setNombre("Jaoa");
		juego1.setCompania("PAM");
		juego1.setPrecio(87.9);
		juego1.setPuntos(4.3);
		
		listaJuegos.add(juego1);
		
		juego1 = new Videojuego();
		
		juego1.setNombre("Jaoa");
		juego1.setCompania("POM");
		juego1.setPrecio(87.9);
		juego1.setPuntos(4.3);
		
		listaJuegos.add(juego1);
		
		juego1 = new Videojuego();
		
		juego1.setNombre("Jaoa");
		juego1.setCompania("PUM");
		juego1.setPrecio(87.9);
		juego1.setPuntos(4.3);
		
		listaJuegos.add(juego1);
		
		juego1 = new Videojuego();
		
		juego1.setNombre("Jaoa");
		juego1.setCompania("PEM");
		juego1.setPrecio(87.9);
		juego1.setPuntos(4.3);
		
		listaJuegos.add(juego1);
		
		juego1 = new Videojuego();
		
		juego1.setNombre("Jaoa");
		juego1.setCompania("PM");
		juego1.setPrecio(87.9);
		juego1.setPuntos(4.3);
		
		listaJuegos.add(juego1);
		
		juego1 = new Videojuego();
		
		juego1.setNombre("Jaoa");
		juego1.setCompania("M");
		juego1.setPrecio(87.9);
		juego1.setPuntos(4.3);
		
		listaJuegos.add(juego1);
		
		dv.saveAll(listaJuegos);
		
	}

}

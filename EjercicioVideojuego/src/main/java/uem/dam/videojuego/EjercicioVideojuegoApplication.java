package uem.dam.videojuego;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import uem.dam.videojuego.modelo.entidad.Videojuego;
import uem.dam.videojuego.modelo.persistencia.DaoVideojuego;

@SpringBootApplication
public class EjercicioVideojuegoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EjercicioVideojuegoApplication.class, args);
	
	
		DaoVideojuego daoJuego = context.getBean("daoVideojuego", DaoVideojuego.class);
		
		//Creamos un Videojuego
		Videojuego juego = new Videojuego();
		
		juego.setNombre("El Ataque de las Muñecas de Manu");
		juego.setCompania("JaJaGames");
		juego.setPrecio(69.9);
		juego.setPuntos(3.2);
		
		daoJuego.save(juego);
		
		Videojuego juego2 = new Videojuego();
		
		juego2.setNombre("El Ataque de las Muñecas de Manu 2: La Venganza de Carla");
		juego2.setCompania("JaJaGames");
		juego2.setPrecio(69.9);
		juego2.setPuntos(8.8);
		
		daoJuego.save(juego2);
		
		//Leemos el juego (con id 1)
		Videojuego datosJuego = daoJuego.findById(1).get();
		System.out.println(datosJuego);
		
		Videojuego modifJuego = new Videojuego();
		
		//Modificamos el Videojuego
		modifJuego.setId(1);
		modifJuego.setNombre("El Ataque de las Muñecas de Manu Definitive Edition HD");
		modifJuego.setCompania("JoJaGames");
		modifJuego.setPrecio(99.9);
		modifJuego.setPuntos(9.9);
	
		daoJuego.save(modifJuego);
		
		//Volvemos a leer el juego (con id 1) para ver si ha cambiado
		datosJuego = daoJuego.findById(1).get();
		System.out.println(datosJuego);
		
		//Usamos el método isPresent para comprobar si e objeto existe en la BBDD
		Optional<Videojuego> cocheOptional = daoJuego.findById(8);
		if(cocheOptional.isPresent()) {
			System.out.println("El Videojuego existe en la BBDD");
			//Si existe el objeto lo desenvolvemos
			System.out.println(cocheOptional.get());
		}else {
			//Si no se muestra un syso indicando que no existe
			System.out.println("El Videojuego no existe en la BBDD");
		}
		
		//Leemos todos los juegos creados dentro de la BBDD
		List<Videojuego> listaJuegos = daoJuego.findAll();
		System.out.println(listaJuegos);
		
		//Borramos el juego con id 1
		daoJuego.deleteById(1);
		
		//Mostramos la lista actualizada sin el juego (con id 1)
		listaJuegos = daoJuego.findAll();
		System.out.println(listaJuegos);
		
	}

}

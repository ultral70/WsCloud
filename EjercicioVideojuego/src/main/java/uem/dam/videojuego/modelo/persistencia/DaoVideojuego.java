package uem.dam.videojuego.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uem.dam.videojuego.modelo.entidad.Videojuego;

/*
 * Creamos una interfaz para hacer el DAO, que extienda de JpaRepository
 * y le pasamos a dicho extend la clase que queremos parametrizar,
 * en este caso Videojuego, y el tipo de dato que es la Primary Key, 
 * que en este caso es un Integer
 * 
 * Y se le da de alta en el contexto de Spring para que 
 * Spring la administre
 * Las etiquetas solo sirven para que el programador 
 * identifique qué es cada clase, por ejemplo, en este caso, sabemos que 
 * esta clase es un DAO por la etiqueta de @Repository
 */

@Repository
public interface DaoVideojuego extends JpaRepository<Videojuego, Integer> {

	
	
}

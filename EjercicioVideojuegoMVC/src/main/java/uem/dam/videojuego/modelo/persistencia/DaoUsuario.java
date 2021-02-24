package uem.dam.videojuego.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uem.dam.videojuego.modelo.entidad.Usuario;

@Repository
public interface DaoUsuario extends JpaRepository<Usuario, Integer> {

	//Se crea esta consulta de forma automática para que se pueda usar más tarde
	public Usuario findByNombreAndPassword(String nombre, String password);
	
}

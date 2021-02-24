package uem.dam.videojuego.modelo.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uem.dam.videojuego.modelo.entidad.Usuario;
import uem.dam.videojuego.modelo.persistencia.DaoUsuario;

@Service
public class GestorUsuario {

	//Hacemos que Spring nos "enlace" para poder utilizar 
	//siempre la misma referencia al DAO
	@Autowired
	private DaoUsuario daoUsuario;
	
	public boolean validarUsuario(Usuario usuario) {
		
		//Aquí es donde utilizamos el método creado en la interfaz, para 
		//comparar un nombre y una contraseña de un usuario con los de la BBDD
		//El método no se puede llamar como se quiera, tiene que tener un 
		//esquema, por ejemplo, si quiero dos datos, los datos se ponen 
		//separados con un And, si no no funciona
		Usuario usuarioAux = 
				daoUsuario.findByNombreAndPassword(usuario.getNombre(), 
				usuario.getPassword());
		
		//Si usuarioAux es null es que no hay ningún usuario 
		//en la BBDD con ese nombre y contraseña, y se retorna false
		if (usuarioAux == null) {
			
			return false;
			
		//Si existe un usuario, se retorna true
		} else return true;
		
	}
	
}

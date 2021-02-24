package uem.dam.videojuego.modelo.negocio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import uem.dam.videojuego.modelo.entidad.Videojuego;
import uem.dam.videojuego.modelo.persistencia.DaoVideojuego;

@Service
public class GestorVideojuego {

	@Autowired
	private DaoVideojuego daoVideoJuego;
	
	public List<Videojuego> dameLista() {
		
		List<Videojuego> listaJuegos = daoVideoJuego.findAll();
		 
		return listaJuegos;
		
	}
	
	public Videojuego buscarJuego(int id) {
		
		//Devuelve un optional, ya que puede, o no, devolver un juego
		Optional<Videojuego> juegoAux = daoVideoJuego.findById(id);
		
		if (juegoAux.isPresent()) {
			
			//Se desenvuelve el optional
			return juegoAux.get();
			
		} else return null;
		
	}
	
}

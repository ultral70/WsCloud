package uem.dam.videojuego.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uem.dam.videojuego.modelo.entidad.Videojuego;
import uem.dam.videojuego.modelo.negocio.GestorVideojuego;

@Controller
public class ControladorVideojuego {

	@Autowired
	GestorVideojuego gestorJuego;
	
	@PostMapping("filtrarJuego")
	public String filtrar(
			@RequestParam("id") int id,
			Model model) {
		
		Videojuego juego = gestorJuego.buscarJuego(id);
		
		 if (juego != null) {
				
			model.addAttribute("juego",juego);
			
			return "Juego";
			
		 }	else return "Error_login";
		
	}
	
}

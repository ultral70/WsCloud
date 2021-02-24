package uem.dam.videojuego.controlador;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uem.dam.videojuego.modelo.entidad.Usuario;
import uem.dam.videojuego.modelo.entidad.Videojuego;
import uem.dam.videojuego.modelo.negocio.GestorUsuario;
import uem.dam.videojuego.modelo.negocio.GestorVideojuego;

//Esta anotación se usa para indicar que esta clase es un controlador
//Con esta anotación, lo que devuelven los métodos es una página web
@Controller
public class ControladorUsuario {

	//Para acceder al static desde el navegador se necesita el nombre exacto, con .html
	
	@Autowired
	GestorUsuario gestorUsuario;
	
	@Autowired
	GestorVideojuego gestorVideojuego;
	
	//Creamos el método doLogin, que usamos en la web, para 
	//representar toda la lógica de la web
	
	//Recogemos los parámetros introducidos en la 
	//web con @RequestParam
	
	//El objeto model es el que usamos para pasar 
	//la info entre clases y web
	@PostMapping("doLogin")
	public String logearse(
			@RequestParam("nombre_usuario") String nombre,
			@RequestParam("pass") String pass,
			Model model) {
		
		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setPassword(pass);
		
		//Llamamos a negocio pasándole el usuario 
		//con los datos obtenidos para que los compare
		boolean validado = gestorUsuario.validarUsuario(usuario);
		
		if (validado) {
			
			//A model le pasamos todos los datos que le queremos 
			//pasar a la vista
			model.addAttribute("nombreUsuario", nombre);
			
			List<Videojuego> lista = gestorVideojuego.dameLista();
			
			model.addAttribute("lista", lista);
			
//			Usuario usuario1 = new Usuario();
//			usuario1.setNombre("Pipo");
//			usuario1.setPassword("1234");
//			
//			listaUsuario.add(usuario1);
//			
//			usuario1 = new Usuario();
//			usuario1.setNombre("Salomón");
//			usuario1.setPassword("1223");
//			
//			listaUsuario.add(usuario1);
//			
//			//También metemos la lista de usuarios en el modelo
//			model.addAttribute("lista", listaUsuario);
			
			//Iremos a la página de inicio con estos datos
			return "Inicio";
			
			//Iremos a la página de error
			
		} else return "Error_login";
		
	}
	
}

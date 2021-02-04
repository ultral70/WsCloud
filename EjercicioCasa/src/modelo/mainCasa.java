package modelo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entidad.Casa;

public class mainCasa {
		
		private static ApplicationContext context;

	    public static void main(String[] args) {
	            context = new ClassPathXmlApplicationContext("recursos/context.xml");

	            Casa casa = context.getBean("casa", Casa.class);
	            
	            System.out.println(casa);
	            
	            casa.calcM2();
	            
	            System.out.println("La casa tiene " + casa.calcM2True() + " metros cuadrados");
	            
	    }
		
	
}

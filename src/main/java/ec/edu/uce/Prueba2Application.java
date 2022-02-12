package ec.edu.uce;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Prueba2Application implements CommandLineRunner {
	
	private static final Logger LOG = LoggerFactory.getLogger(ProyectoSpringJpaPaApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(Prueba2Application.class, args);
	}

}

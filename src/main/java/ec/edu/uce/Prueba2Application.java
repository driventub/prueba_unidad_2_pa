package ec.edu.uce;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.Doctor;
import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.service.IDoctorService;
import ec.edu.uce.service.IPacienteService;

@SpringBootApplication
public class Prueba2Application implements CommandLineRunner {
	
	@Autowired
	private IPacienteService pacienteService;
	
	@Autowired
	private IDoctorService doctorService;
	
	
	private static final Logger LOG = LoggerFactory.getLogger(Prueba2Application.class);
	public static void main(String[] args) {
		SpringApplication.run(Prueba2Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		
		Paciente p1 = new Paciente();
		Paciente p2 = new Paciente();
		Doctor d1 = new Doctor();
		Doctor d2 = new Doctor();
		
//		Paciente 1
		p1.setCedula("123456789-0");
		p1.setNombre("Ceci");
		p1.setApellido("Astudillo");
		p1.setFechaNacimiento(LocalDateTime.of(2003,Month.AUGUST,8,12,45));
		
		p1.setCodigoIess(6647);
		p1.setEstatura(new BigDecimal("1.9"));
		p1.setPeso(new BigDecimal("55.4"));
		
//		Deberia haber un calculo con la fecha de nacimiento,
		p1.setEdad(18);
		
		
		this.pacienteService.guardar(p1);
		LOG.info(p1.toString());
		
//		Paciente 2
		
		p2.setCedula("246801357-9");
		p2.setNombre("Maribel");
		p2.setApellido("Solano");
		p2.setFechaNacimiento(LocalDateTime.of(1999,Month.SEPTEMBER,8,12,45));
		
		p2.setCodigoIess(8839);
		p2.setEstatura(new BigDecimal("1.57"));
		p2.setPeso(new BigDecimal("55.4"));
		
//		Deberia haber un calculo con la fecha de nacimiento,
		p2.setEdad(22);
		
		
		this.pacienteService.guardar(p2);
		LOG.info(p2.toString());
//		Doctor 1
		
		d1.setCedula("6647388273-8");
		d1.setNombre("Ana");
		d1.setApellido("Armas");
		d1.setFechaNacimiento(LocalDateTime.of(1999,Month.MAY,8,12,45));
		d1.setNumeroConsultorio(202);
		d1.setCodigoSenescyt(388382);
		d1.setSueldo(new BigDecimal("4000.00"));
		
		this.doctorService.guardar(d1);
		LOG.info(d1.toString());
		
//		Doctor 1
		
		d2.setCedula("173382733-8");
		d2.setNombre("Luis");
		d2.setApellido("Anatoa");
		d2.setFechaNacimiento(LocalDateTime.of(1964,Month.JUNE,8,12,45));
		d2.setNumeroConsultorio(202);
		d2.setCodigoSenescyt(388382);
		d2.setSueldo(new BigDecimal("3430.00"));
		
		
		
		this.doctorService.guardar(d2);
		LOG.info(d2.toString());
		
		
		
	}

}

package ec.edu.uce;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.Doctor;
import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.service.ICitaMedicaService;
import ec.edu.uce.service.IDoctorService;
import ec.edu.uce.service.IGestorService;
import ec.edu.uce.service.IPacienteService;
/**
 * 
 * @author aldaz
 *	El logging del reporte esta incluido al momento de buscar
 *	Tuve que sacar un log4j de mvn repository que esta con vulnerabilidades, 
 *	pero es el unico que me vale
 */
@SpringBootApplication
public class Prueba2Application implements CommandLineRunner {
	
	@Autowired
	private IPacienteService pacienteService;
	
	@Autowired
	private IDoctorService doctorService;
	
	@Autowired
	
	private ICitaMedicaService citaService;
	

	
	@Autowired
	private IGestorService gestor;
	
	
	private static final Logger LOG = Logger.getLogger(Prueba2Application.class);
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
		p1.setCedula("1438290134-9");
		p1.setNombre("Fernando");
		p1.setApellido("Alonso");
		p1.setFechaNacimiento(LocalDateTime.of(2001,Month.AUGUST,22,12,45));
		
		p1.setCodigoIess(1234);
		p1.setEstatura(new BigDecimal("1.9"));
		p1.setPeso(new BigDecimal("55.4"));
		
//		Deberia haber un calculo con la fecha de nacimiento,
		p1.setEdad(18);
		
//		
		this.pacienteService.guardar(p1);
		LOG.info(p1.toString());
		
//		Paciente 2
		
		p2.setCedula("1028347567-9");
		p2.setNombre("Damien");
		p2.setApellido("Solin");
		p2.setFechaNacimiento(LocalDateTime.of(1993,Month.SEPTEMBER,19,12,45));
		
		p2.setCodigoIess(3987);
		p2.setEstatura(new BigDecimal("1.57"));
		p2.setPeso(new BigDecimal("55.4"));
		
//		Deberia haber un calculo con la fecha de nacimiento,
		p2.setEdad(22);
		
		
		this.pacienteService.guardar(p2);
		LOG.info(p2.toString());
		
//		Doctor 1
		
		d1.setCedula("190463874-8");
		d1.setNombre("Agustina");
		d1.setApellido("Cardoso");
		d1.setFechaNacimiento(LocalDateTime.of(1997,Month.MAY,2,12,45));
		d1.setNumeroConsultorio(202);
		d1.setCodigoSenescyt(388382);
		d1.setSueldo(new BigDecimal("4000.00"));
		
		this.doctorService.guardar(d1);
		LOG.info(d1.toString());
		
//		Doctor 2
		
		d2.setCedula("125688737-8");
		d2.setNombre("Guillermo");
		d2.setApellido("Cuaron");
		d2.setFechaNacimiento(LocalDateTime.of(1964,Month.JUNE,5,12,45));
		d2.setNumeroConsultorio(202);
		d2.setCodigoSenescyt(143283);
		d2.setSueldo(new BigDecimal("3430.00"));
		
		
		
		this.doctorService.guardar(d2);
		LOG.info(d2.toString());
		
//		Actualizar
		
		d1.setNumeroConsultorio(203);
		p2.setPeso(new BigDecimal("65.33"));
		
		this.pacienteService.actualizar(p2);
		this.doctorService.actualizar(d1);
		
		
//		Agendar
		
		
		this.gestor.agendarCita(12345, LocalDateTime.of(2022,Month.JUNE,8,12,45), new BigDecimal("30.22"), "Condado", d2.getCedula(),p1.getCedula() );
		
//		Actualizar
		
		this.gestor.resultadoCita(12345,"Fiebre","Paracetamol", LocalDateTime.of(2023,Month.JUNE,8,12,45) );
		
		
//		Reporte
		
		
//		
		this.citaService.reportarCita(LocalDateTime.of(2021,Month.JUNE,8,12,45), new BigDecimal("1.33"));
	}

}

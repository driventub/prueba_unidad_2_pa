package ec.edu.uce.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import ec.edu.uce.modelo.CitaMedica;
import ec.edu.uce.modelo.Doctor;
import ec.edu.uce.modelo.Paciente;

public interface ICitaMedicaRepo {
	void agendarCita(Integer num, LocalDateTime fecha, BigDecimal val, String lugar, String apellido, Integer codigo); 
//	void actualizarCita(CitaMedica cime);
//	CitaMedica reporteCita(LocalDateTime fecha, BigDecimal valor);
	
	
	
}

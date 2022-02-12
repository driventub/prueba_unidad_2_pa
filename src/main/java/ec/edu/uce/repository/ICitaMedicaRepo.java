package ec.edu.uce.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import ec.edu.uce.modelo.CitaMedica;
import ec.edu.uce.modelo.Doctor;
import ec.edu.uce.modelo.Paciente;

public interface ICitaMedicaRepo {
	void agendarCita(CitaMedica cime, Paciente p, Doctor d);
	void actualizarCita(CitaMedica cime);
	CitaMedica reporteCita(LocalDateTime fecha, BigDecimal valor);
	
}

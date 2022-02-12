package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import ec.edu.uce.modelo.CitaMedica;
import ec.edu.uce.modelo.Doctor;
import ec.edu.uce.modelo.Paciente;

public interface ICitaMedicaService {
	void agendar(CitaMedica cime, Paciente p, Doctor d);
	void actualizar(CitaMedica cime);
	CitaMedica reportar(LocalDateTime fecha, BigDecimal valor);
}

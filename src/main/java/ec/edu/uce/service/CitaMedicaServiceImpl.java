package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.CitaMedica;
import ec.edu.uce.modelo.Doctor;
import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.repository.ICitaMedicaRepo;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService{
	
	@Autowired
	private ICitaMedicaRepo cita;
	
	@Override
	public void agendar(CitaMedica cime, Paciente p, Doctor d) {
		this.cita.agendarCita(cime,p,d);
		
	}

	@Override
	public void actualizar(CitaMedica cime) {
		this.cita.actualizarCita(cime);
		
	}

	@Override
	public CitaMedica reportar(LocalDateTime fecha, BigDecimal valor) {
		
		return this.cita.reporteCita(fecha,valor);
	}

}

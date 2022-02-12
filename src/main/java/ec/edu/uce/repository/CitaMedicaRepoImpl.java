package ec.edu.uce.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.CitaMedica;
import ec.edu.uce.modelo.Doctor;
import ec.edu.uce.modelo.Paciente;

@Repository
@Transactional
public class CitaMedicaRepoImpl implements ICitaMedicaRepo{
	
	private static final Logger LOG = LogManager.getLogger(DoctorRepoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void agendarCita(CitaMedica cime, Paciente p, Doctor d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarCita(CitaMedica cime) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CitaMedica reporteCita(LocalDateTime fecha, BigDecimal valor) {
		// TODO Auto-generated method stub
		return null;
	}

}

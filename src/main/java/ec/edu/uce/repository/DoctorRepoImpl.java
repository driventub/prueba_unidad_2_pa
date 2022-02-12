package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Doctor;


@Repository
@Transactional
public class DoctorRepoImpl implements IDoctorRepo{
	
	private static final Logger LOG = LogManager.getLogger(DoctorRepoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarDoctor(Doctor p) {
		this.entityManager.persist(p);
		
	}

	@Override
	public Doctor buscarDoctor(Integer id) {
		return this.entityManager.find(Doctor.class, id);
	}

	@Override
	public void actualizarDoctorPorId(Doctor p) {
		this.entityManager.merge(p);
		
	}

	@Override
	public void borrarDoctorPorId(Integer id) {
		Doctor dBorrar = this.buscarDoctor(id);
		this.entityManager.remove(dBorrar);
		
	}

}

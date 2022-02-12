package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Paciente;

@Repository
@Transactional
public class PacienteRepoImpl implements IPacienteRepo {

	private static final Logger LOG = LogManager.getLogger(PacienteRepoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarPaciente(Paciente p) {
		this.entityManager.persist(p);
		
	}

	@Override
	public Paciente buscarPaciente(Integer id) {
		return this.entityManager.find(Paciente.class, id);
	}

	@Override
	public void actualizarPacientePorId(Paciente p) {
		this.entityManager.merge(p);
		
	}

	@Override
	public void borrarPacientePorId(Integer id) {
		Paciente dBorrar = this.buscarPaciente(id);
		this.entityManager.remove(dBorrar);
		
	}
}

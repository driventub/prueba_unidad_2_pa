package ec.edu.uce.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.CitaMedica;
import ec.edu.uce.modelo.Doctor;
import ec.edu.uce.modelo.Paciente;

@Repository
@Transactional
public class CitaMedicaRepoImpl implements ICitaMedicaRepo {

	private static final Logger LOG = LogManager.getLogger(DoctorRepoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void agendarCita(Integer num, LocalDateTime fecha, BigDecimal val, String lugar, String apellido,
			Integer codigo) {
		CitaMedica cime = new CitaMedica();
		BigDecimal valAnt = valorAnterior(1);
		BigDecimal total = val.add(valAnt.multiply(new BigDecimal("0.12")));
		Doctor doct = buscarDoctorPorApellidoNative(apellido);
		Paciente paci = buscarPacientePorCodigoNative(codigo);
		entityManager.createNativeQuery(
				"INSERT INTO cita_medica (cime_numero, cime_fecha_cita, cime_valor_cita, cime_lugar_cita, doct_id, paci_id , cime_id) VALUES (?,?,?,?,?,?,?)")
//		 Segun este codigo, se puede poner asi, para cuando son incersiones
//		 el numero es la posicion donde esta cada parametro de la tabla
		
//		Seteo el id
				.setParameter(1, num).setParameter(2, fecha).setParameter(3, total).setParameter(4, lugar)
				.setParameter(5, doct.getId()).setParameter(6, paci.getId()).setParameter(7, 4).executeUpdate();

	}

	public Doctor buscarDoctorPorApellidoNative(String apellido) {
		Query miQuery = this.entityManager.createNativeQuery("SELECT * FROM doctor g WHERE g.doct_apellido=:valor",
				Doctor.class);
		miQuery.setParameter("valor", apellido);

		return (Doctor) miQuery.getSingleResult();
	}

	public Paciente buscarPacientePorCodigoNative(Integer codigo) {
		Query miQuery = this.entityManager.createNativeQuery("SELECT * FROM paciente g WHERE g.paci_codigo_iess=:valor",
				Paciente.class);
		miQuery.setParameter("valor", codigo);

		return (Paciente) miQuery.getSingleResult();
	}
	
//	No se me ocurre como conseguir el valor anterior, ya que parece que el id es otro tipo diferente de integer 
//	al momento de sacarlo de la base de datos
//	En Integer i deberia estar alguna manera de decirle que es el id anterior 
	public BigDecimal valorAnterior(Integer i) {
		Query miQuery = this.entityManager.createNativeQuery("SELECT * FROM cita_medica g WHERE g.cime_id=:valor",
				CitaMedica.class);
		miQuery.setParameter("valor", i);
		
		CitaMedica cita = (CitaMedica) miQuery.getSingleResult();
		return cita.getValorCita();
	}
}

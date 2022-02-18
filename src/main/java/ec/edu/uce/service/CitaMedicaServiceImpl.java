package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.CitaMedica;
import ec.edu.uce.modelo.ReporteCitaMedica;
import ec.edu.uce.repository.ICitaMedicaRepo;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService{
	
	private static final Logger LOG = LogManager.getLogger(DoctorServiceImpl.class);
	
	@Autowired
	private ICitaMedicaRepo cita;

//	@Override
//	public void agendar(Integer num, LocalDateTime fecha, BigDecimal val, String lugar, String apellido,
//			Integer codigo) {
//		if(fecha.isAfter(LocalDateTime.now()) == true) {
//			this.cita.agendarCita(num,fecha,val,lugar,apellido,codigo);
//		}else {
//			LOG.warn("No se pudo agendar, fecha invalida");
//		}
//		
//	}
//
	@Override
	public CitaMedica buscarPorNumero(Integer numero) {
		return this.cita.buscarPorNumero(numero);
	}

	@Override
	public void actualizar(CitaMedica citaMedica) {
		this.cita.actualizar(citaMedica);
		
	}

	@Override
	public void insertar(CitaMedica cita) {
		this.cita.insertar(cita);
		
	}

	@Override
	public List<ReporteCitaMedica> reportarCita(LocalDateTime fecha, BigDecimal valor) {
		return this.cita.reportarCita(fecha,valor);
	}
	
	
	

	

}

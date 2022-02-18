package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import ec.edu.uce.modelo.CitaMedica;
import ec.edu.uce.modelo.ReporteCitaMedica;

public interface ICitaMedicaService {
//	void agendar(Integer num, LocalDateTime fecha, BigDecimal val, String lugar, String apellido, Integer codigo);
//
	CitaMedica buscarPorNumero(Integer numero);

	void actualizar(CitaMedica citaMedica);
	
	void insertar(CitaMedica cita);
	
	List<ReporteCitaMedica> reportarCita(LocalDateTime fecha, BigDecimal valor);
}

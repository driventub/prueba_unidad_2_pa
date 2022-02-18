package ec.edu.uce.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import ec.edu.uce.modelo.CitaMedica;
import ec.edu.uce.modelo.ReporteCitaMedica;


public interface ICitaMedicaRepo {
//	void agendarCita(Integer num, LocalDateTime fecha, BigDecimal val, String lugar, String apellido, Integer codigo); 
//	void actualizarCita(CitaMedica cime);
//	CitaMedica reporteCita(LocalDateTime fecha, BigDecimal valor);
	
	CitaMedica buscarPorNumero(Integer numero);
	
	void actualizar(CitaMedica citaMedica);
	
	void insertar(CitaMedica cita);
	
	List<ReporteCitaMedica> reportarCita(LocalDateTime fecha, BigDecimal valor);
	
}

package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import ec.edu.uce.modelo.CitaMedica;

public interface ICitaMedicaService {
	void agendar(Integer num, LocalDateTime fecha, BigDecimal val, String lugar, String apellido, Integer codigo);

	CitaMedica buscarPorNumero(Integer numero);

	void actualizar(CitaMedica citaMedica);
}

package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;


public interface ICitaMedicaService {
	void agendar(Integer num, LocalDateTime fecha, BigDecimal val, String lugar, String apellido, Integer codigo);
		
}

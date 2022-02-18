package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface IGestorService {
	void resultadoCita(Integer numero, String diagnostico, String receta, LocalDateTime fechaProxima);
	
	void agendarCita(Integer num, LocalDateTime fecha, BigDecimal val, String lugar, String cedulaDoctor,
			String cedulaPaci);
}

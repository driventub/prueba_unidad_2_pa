package ec.edu.uce.service;

import java.time.LocalDateTime;

public interface IGestorService {
	void resultadoCita(Integer numero, String diagnostico, String receta, LocalDateTime fechaProxima);
}

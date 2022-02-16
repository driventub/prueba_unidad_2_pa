package ec.edu.uce.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.CitaMedica;

@Service
public class GestorServiceImpl implements IGestorService{
	
	@Autowired
	private ICitaMedicaService citaMedica;
	
	
	@Override
	public void resultadoCita(Integer numero, String diagnostico, String receta, LocalDateTime fechaProxima) {
		
		CitaMedica c1 = this.citaMedica.buscarPorNumero(numero);
		c1.setDiagnostico(diagnostico);
		c1.setReceta(receta);
		c1.setFechaControl(fechaProxima);
		
		this.citaMedica.actualizar(c1);
		
	}

}

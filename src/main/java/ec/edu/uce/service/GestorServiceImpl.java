package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.CitaMedica;
import ec.edu.uce.modelo.Doctor;
import ec.edu.uce.modelo.Paciente;

@Service
public class GestorServiceImpl implements IGestorService{
	
	@Autowired
	private ICitaMedicaService citaMedica;
	
	@Autowired
	private IPacienteService paci;
	
	@Autowired
	private IDoctorService doct;
	
	
	@Override
	public void resultadoCita(Integer numero, String diagnostico, String receta, LocalDateTime fechaProxima) {
		
		CitaMedica c1 = this.citaMedica.buscarPorNumero(numero);
		c1.setDiagnostico(diagnostico);
		c1.setReceta(receta);
		c1.setFechaControl(fechaProxima);
		
		this.citaMedica.actualizar(c1);
		
	}


	@Override
	public void agendarCita(Integer num, LocalDateTime fecha, BigDecimal val, String lugar, String cedulaDoctor,
			String cedulaPaci) {
		Paciente p = this.paci.buscarPorCedula(cedulaPaci);
		Doctor d = this.doct.buscarPorCedula(cedulaDoctor);
		
		CitaMedica c1 = new CitaMedica();
		c1.setNumero(num);
		c1.setFechaCita(fecha);
		c1.setValorCita(val);
		c1.setLugarCita(lugar);
		c1.setDoctor(d);
		c1.setPaciente(p);
		
		this.citaMedica.insertar(c1);
		
		
	}

}

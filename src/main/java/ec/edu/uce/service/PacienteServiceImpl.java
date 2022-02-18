package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.repository.IPacienteRepo;

@Service
public class PacienteServiceImpl implements IPacienteService{
	@Autowired
	private IPacienteRepo pacienteRepo;
	
	@Override
	public void guardar(Paciente g) {
		this.pacienteRepo.insertarPaciente(g);
		
	}

	@Override
	public void actualizar(Paciente g) {
		this.pacienteRepo.actualizarPacientePorId(g);
		
	}

	@Override
	public Paciente buscar(Integer i) {
		
		return this.pacienteRepo.buscarPaciente(i);
	}

	@Override
	public void eliminar(Integer i) {
		this.pacienteRepo.borrarPacientePorId(i);
	}

	@Override
	public Paciente buscarPorCedula(String cedula) {
		return this.pacienteRepo.buscarPorCedula(cedula);
		
	}
	
}	
	
	

package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.repository.IPacienteRepo;

@Service
public class PacienteServiceImpl implements IPacienteService{
	@Autowired
	private IPacienteRepo doctorRepo;
	
	@Override
	public void guardar(Paciente g) {
		this.doctorRepo.insertarPaciente(g);
		
	}

	@Override
	public void actualizar(Paciente g) {
		this.doctorRepo.actualizarPacientePorId(g);
		
	}

	@Override
	public Paciente buscar(Integer i) {
		
		return this.doctorRepo.buscarPaciente(i);
	}

	@Override
	public void eliminar(Integer i) {
		this.doctorRepo.borrarPacientePorId(i);
	}
	
}	
	
	

package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Doctor;
import ec.edu.uce.repository.IDoctorRepo;

@Service
public class DoctorServiceImpl implements IDoctorService {
	
	@Autowired
	private IDoctorRepo doctorRepo;
	
	@Override
	public void guardar(Doctor g) {
		this.doctorRepo.insertarDoctor(g);
		
	}

	@Override
	public void actualizar(Doctor g) {
		this.doctorRepo.actualizarDoctorPorId(g);
		
	}

	@Override
	public Doctor buscar(Integer i) {
		
		return this.doctorRepo.buscarDoctor(i);
	}

	@Override
	public void eliminar(Integer i) {
		this.doctorRepo.borrarDoctorPorId(i);
		
	}

	@Override
	public Doctor buscarPorCedula(String cedula) {
		return this.doctorRepo.buscarPorCedula(cedula);
	}
}

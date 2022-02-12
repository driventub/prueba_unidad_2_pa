package ec.edu.uce.service;

import ec.edu.uce.modelo.Doctor;

public interface IDoctorService {
	void guardar(Doctor g);

	void actualizar(Doctor g);

	Doctor buscar(Integer i);

	void eliminar(Integer i);
}

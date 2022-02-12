package ec.edu.uce.repository;

import ec.edu.uce.modelo.Doctor;

public interface IDoctorRepo {
	void insertarDoctor(Doctor p);

	Doctor buscarDoctor(Integer id);

	void actualizarDoctorPorId(Doctor p);

	void borrarDoctorPorId(Integer id);
}

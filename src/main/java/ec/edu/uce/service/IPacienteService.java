package ec.edu.uce.service;

import ec.edu.uce.modelo.Paciente;

public interface IPacienteService {
	void guardar(Paciente g);

	void actualizar(Paciente g);

	Paciente buscar(Integer i);

	void eliminar(Integer i);
}

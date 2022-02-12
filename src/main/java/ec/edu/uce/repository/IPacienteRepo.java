package ec.edu.uce.repository;



import ec.edu.uce.modelo.Paciente;

public interface IPacienteRepo {
	void insertarPaciente(Paciente p);

	Paciente buscarPaciente(Integer id);

	void actualizarPacientePorId(Paciente p);

	void borrarPacientePorId(Integer id);
}

package ec.edu.uce.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "seq_doctor")
	@SequenceGenerator(name ="seq_doctor",sequenceName="seq_doctor",allocationSize = 1)
	@Column(name = "doct_id")
	private Integer id;
	
	@Column(name = "doct_cedula")
	private String cedula;
	
	@Column(name = "doct_nombre")
	private String nombre;
	
	@Column(name = "doct_apellido")
	private String apellido;
	
	@Column(name = "doct_fecha_nacimiento", columnDefinition = "TIMESTAMP")
	private LocalDateTime fechaNacimiento;
	
	@Column(name = "doct_numero_consultorio")
	private Integer numeroConsultorio;
	
	@Column(name = "doct_codigo_senescyt")
	private Integer codigoSenescyt;
	
	@Column(name = "doct_sueldo")
	private BigDecimal sueldo;
	
	@OneToMany(mappedBy = "doctor",cascade = CascadeType.ALL )
	private List<CitaMedica> citaMedica;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getNumeroConsultorio() {
		return numeroConsultorio;
	}

	public void setNumeroConsultorio(Integer numeroConsultorio) {
		this.numeroConsultorio = numeroConsultorio;
	}

	public Integer getCodigoSenescyt() {
		return codigoSenescyt;
	}

	public void setCodigoSenescyt(Integer codigoSenescyt) {
		this.codigoSenescyt = codigoSenescyt;
	}

	public BigDecimal getSueldo() {
		return sueldo;
	}

	public void setSueldo(BigDecimal sueldo) {
		this.sueldo = sueldo;
	}

	public List<CitaMedica> getCitaMedica() {
		return citaMedica;
	}

	public void setCitaMedica(List<CitaMedica> citaMedica) {
		this.citaMedica = citaMedica;
	}

	
	
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechaNacimiento=" + fechaNacimiento + ", numeroConsultorio=" + numeroConsultorio
				+ ", codigoSenescyt=" + codigoSenescyt + ", sueldo=" + sueldo + "]";
	}
	
	
}

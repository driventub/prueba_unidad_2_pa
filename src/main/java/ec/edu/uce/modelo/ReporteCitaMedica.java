package ec.edu.uce.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ReporteCitaMedica {
	private Integer numeroCita;
	private LocalDateTime fechaCita;
	private BigDecimal valorCita;
	private LocalDateTime fechaControl;
	
	
	public ReporteCitaMedica() {
		
	}

	public ReporteCitaMedica(Integer numeroCita, LocalDateTime fechaCita, BigDecimal valorCita, LocalDateTime fechaControl) {
		super();
		this.numeroCita = numeroCita;
		this.fechaCita = fechaCita;
		this.valorCita = valorCita;
		this.fechaControl = fechaControl;
	}

	public Integer getNumeroCita() {
		return numeroCita;
	}

	public void setNumeroCita(Integer numeroCita) {
		this.numeroCita = numeroCita;
	}

	public LocalDateTime getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}

	public BigDecimal getValorCita() {
		return valorCita;
	}

	public void setValorCita(BigDecimal valorCita) {
		this.valorCita = valorCita;
	}

	public LocalDateTime getFechaControl() {
		return fechaControl;
	}

	public void setFechaControl(LocalDateTime fechaControl) {
		this.fechaControl = fechaControl;
	}

	@Override
	public String toString() {
		return "ReporteCitaMedica [numeroCita=" + numeroCita + ", fechaCita=" + fechaCita + ", valorCita=" + valorCita
				+ ", fechaControl=" + fechaControl + "]";
	}

}

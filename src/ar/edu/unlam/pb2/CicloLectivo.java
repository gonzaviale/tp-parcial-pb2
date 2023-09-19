package ar.edu.unlam.pb2;

import java.util.Date;

public class CicloLectivo {

	private Date fechaInicio;
	private Date fechaFin;
	private Date fechaInscripcion;
	
	public CicloLectivo() {
		
	}
	
	public CicloLectivo(Date fechaInicio, Date fechaFin, Date fechaInscripcion) {
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.fechaInscripcion = fechaInscripcion; 
	}

	Date getFechaInicio() {
		return fechaInicio;
	}

	void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	Date getFechaFin() {
		return fechaFin;
	}

	void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	Date getFechaInscripcion() {
		return fechaInscripcion;
	}

	void setFechaInscripcion(Date fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}
	
}

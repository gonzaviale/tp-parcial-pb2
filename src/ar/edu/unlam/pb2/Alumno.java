package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.Date;

public class Alumno {
	
	private String nombre;
	private String apellido;
	private Integer dni;
	private Date fechaNac; 
	private Date fechaIngreso;
	private ArrayList<Materia> materiasAprobadas;
	private ArrayList<Materia> materiasPendientes; 

	public Alumno() {
		
	}
	
	public Alumno(String nombre, String apellido, Integer dni, Date fechaNac, Date fechaIngreso) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.fechaNac = fechaNac;
		this.fechaIngreso = fechaIngreso; 
	}
	
	public Alumno(String nombre, String apellido, Integer dni, Date fechaNac) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.fechaNac = fechaNac;
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

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public ArrayList<Materia> getMateriasAprobadas() { 
		return materiasAprobadas;
	}

	public void setMateriasAprobadas(ArrayList<Materia> materiasAprobadas) {
		this.materiasAprobadas = materiasAprobadas;
	}

	public ArrayList<Materia> getMateriasPendientes() {
		return materiasPendientes;
	}

	public void setMateriasPendientes(ArrayList<Materia> materiasPendientes) {
		this.materiasPendientes = materiasPendientes;
	}
	
} 

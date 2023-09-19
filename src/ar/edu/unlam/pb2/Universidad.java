package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Universidad {

	private ArrayList<Alumno> alumnos;
	private ArrayList<Carrera> carreras;
	private ArrayList<Profesor> profesores;
	private ArrayList<Comision> comisiones;
	private ArrayList<Aula> aulas;
	
	public Universidad() {
		
	}
	
	public Universidad(ArrayList<Alumno> alumnos, ArrayList<Carrera> carreras, ArrayList<Profesor> profesores, ArrayList<Comision> comisiones, ArrayList<Aula> aulas) {
		this.alumnos = alumnos;
		this.carreras = carreras;
		this.profesores = profesores;
		this.comisiones = comisiones;
		this.aulas = aulas; 
	}
	
	public void agregarAlumno(Alumno alumno) {
		if(!existeAlumno(alumno.getDni())) {
			alumnos.add(alumno);
		}
	}

	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public ArrayList<Carrera> getCarreras() {
		return carreras;
	}

	public void setCarreras(ArrayList<Carrera> carreras) {
		this.carreras = carreras;
	}

	public ArrayList<Profesor> getProfesores() {
		return profesores;
	}

	public void setProfesores(ArrayList<Profesor> profesores) {
		this.profesores = profesores;
	}

	public ArrayList<Comision> getComisiones() {
		return comisiones;
	}

	public void setComisiones(ArrayList<Comision> comisiones) {
		this.comisiones = comisiones;
	}

	public ArrayList<Aula> getAulas() {
		return aulas;
	}

	public void setAulas(ArrayList<Aula> aulas) {
		this.aulas = aulas;
	}
	
	private boolean existeAlumno(Integer dni) {
		boolean resultado = false;
		for (Alumno alumno : alumnos) {
			if(alumno.getDni().equals(dni)) {
				resultado = true;
			}
		}
		return resultado;
	}
	
}

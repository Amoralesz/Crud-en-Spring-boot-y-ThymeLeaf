package com.administrar.docentemvc.modelo.servicio;

import java.util.List;

import com.administrar.docentemvc.modelo.entidades.Docente;

public interface DocenteServicio {
	
	public List<Docente> listarTodosLosDocentes();
	
	public Docente guardarDocente(Docente docente);
	
	public Docente obtenerDocentePorId(Long id);
	
	public Docente actualizarDocente(Docente docente);
	
	public void eliminarDocente(Long id);
		
	
		
	}



package com.administrar.docentemvc.modelo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.administrar.docentemvc.modelo.entidades.Docente;
import com.administrar.docentemvc.modelo.repositorio.DocenteRepositorio;

@Service
public class DocenteServicioImpl implements DocenteServicio {

	@Autowired
	private DocenteRepositorio repositorio;

	@Override
	public List<Docente> listarTodosLosDocentes() {
		return repositorio.findAll();
	}

	@Override
	public Docente guardarDocente(Docente docente) {
		return repositorio.save(docente);
	}

	@Override
	public Docente obtenerDocentePorId(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Docente actualizarDocente(Docente docente) {
		return repositorio.save(docente);
	}

	@Override
	public void eliminarDocente(Long id) {
		repositorio.deleteById(id);

	}

}

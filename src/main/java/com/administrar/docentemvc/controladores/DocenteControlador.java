package com.administrar.docentemvc.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.administrar.docentemvc.modelo.entidades.Docente;
import com.administrar.docentemvc.modelo.servicio.DocenteServicio;


@Controller
public class DocenteControlador {

	@Autowired
	private DocenteServicio servicio;

	@GetMapping({ "/docentes", "/" })
	public String listarDocentes(Model modelo) {
		modelo.addAttribute("docentes", servicio.listarTodosLosDocentes());
		return "docentes";
	}

	@GetMapping("/docentes/nuevo")
	public String agregarDocenteFormulario(Model modelo) {
		Docente docente = new Docente();
		modelo.addAttribute("docente", docente);
		return "agregar-docente";
	}

	@PostMapping("/docentes")
	public String guardarDocente(@ModelAttribute("docente") Docente docente) {
		servicio.guardarDocente(docente);
		return "redirect:/docentes";
	}

	@GetMapping("/docentes/editar/{id}")
	public String mostrarFormularioEditar(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("docente", servicio.obtenerDocentePorId(id));
		return "editar_docente";

	}

	@PostMapping("/docentes/{id}")
	public String actualizarDocente(@PathVariable Long id, @ModelAttribute("docente") Docente docente, Model modelo) {
		Docente docenteExistente = servicio.obtenerDocentePorId(id);
		docenteExistente.setId(id);
		docenteExistente.setNombre(docente.getNombre());
		docenteExistente.setApellidos(docente.getApellidos());
		docenteExistente.setEmail(docente.getEmail());
		docenteExistente.setTelefono(docente.getTelefono());
		docenteExistente.setBlog(docente.getBlog());
		docenteExistente.setProfesional(docente.getProfesional());
		docenteExistente.setEscalaron(docente.getEscalaron());
		docenteExistente.setIdioma(docente.getIdioma());
		docenteExistente.setAnosExperiencia(docente.getAnosExperiencia());
		docenteExistente.setAreaTrabajo(docente.getAreaTrabajo());

		servicio.actualizarDocente(docenteExistente);
		return "redirect:/docentes";

	}

	@GetMapping("/docentes/{id}")
	public String eliminarDocenteString(@PathVariable Long id) {
		servicio.eliminarDocente(id);
		return "redirect:/docentes";
	}
}

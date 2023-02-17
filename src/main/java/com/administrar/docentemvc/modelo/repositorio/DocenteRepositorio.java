package com.administrar.docentemvc.modelo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.administrar.docentemvc.modelo.entidades.Docente;

@Repository
public interface DocenteRepositorio extends JpaRepository<Docente, Long> {

}

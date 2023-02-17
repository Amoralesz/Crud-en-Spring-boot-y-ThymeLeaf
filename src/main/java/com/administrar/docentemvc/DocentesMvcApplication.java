package com.administrar.docentemvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.administrar.docentemvc.modelo.entidades.Docente;
import com.administrar.docentemvc.modelo.repositorio.DocenteRepositorio;

@SpringBootApplication
public class DocentesMvcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DocentesMvcApplication.class, args);
	}
	
	@Autowired
	private DocenteRepositorio repositorio;

	@Override
	public void run(String... args) throws Exception {

}
	
}

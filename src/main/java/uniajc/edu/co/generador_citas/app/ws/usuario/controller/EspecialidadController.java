package uniajc.edu.co.generador_citas.app.ws.usuario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uniajc.edu.co.generador_citas.app.ws.pojos.Especialidad;
import uniajc.edu.co.generador_citas.app.ws.usuario.service.EspecialidadService;

@CrossOrigin(origins="http://localhost:3000")
@EnableAutoConfiguration
@RestController
@RequestMapping(value = "especialidadws")
public class EspecialidadController {

	@Autowired
	EspecialidadService service;
	
	@GetMapping(value= "list")
	public ResponseEntity<List<Especialidad>> getEspecialidad(){
		List<Especialidad> especialidad = service.findAll();
		return new ResponseEntity<List<Especialidad>>(especialidad,HttpStatus.OK);
	}
}
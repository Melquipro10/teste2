package com.br.melqui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.melqui.model.Cartas;
import com.br.melqui.service.CartasService;

@RestController
@RequestMapping("/")
public class CartasController {

	@Autowired
	private CartasService service;
	
	@GetMapping("/buscar")
	public List<Cartas> findAll () {
		return service.findAll();
	}
	
	@GetMapping("/buscarid")
	public Cartas findById (Long id) {
		return service.finfById(id);
	}
	
	@PostMapping("/save")
	public void save (Cartas cartas) {
		service.save(cartas);
	}
	
	@PutMapping("/update")
	public void update (Cartas cartas) {
		service.save(cartas);
	}
	
	@DeleteMapping("/delete")
	public void delete (Long id) {
		service.delete(id);
	}
}

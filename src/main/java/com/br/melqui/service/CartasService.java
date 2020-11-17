package com.br.melqui.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.melqui.model.Cartas;
import com.br.melqui.repository.CartasRepository;

@Service
public class CartasService {
	
	@Autowired
	private CartasRepository repository;

	public List<Cartas> findAll() {
		return (List<Cartas>) repository.findAll();
	}
	
	public Cartas finfById (Long id) {
		return repository.findById(id).orElse(null);
	}
	
	public void save (Cartas cartas) {
		repository.save(cartas);
	}
	
	public void update (Cartas cartas) {
		repository.save(cartas);
	}
	
	public void delete (Long id) {
		repository.deleteById(id);
	}
}

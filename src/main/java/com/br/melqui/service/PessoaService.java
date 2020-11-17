package com.br.melqui.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.melqui.model.Pessoa;
import com.br.melqui.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository repository;
	
	public List<Pessoa> findAll() {
		return repository.findAll();
	}
	
	public Pessoa findById(Long id) {
		return repository.findById(id).orElse(null);
	}
	
	public Pessoa save(Pessoa pessoa) {
    	return repository.saveAndFlush(pessoa);	
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
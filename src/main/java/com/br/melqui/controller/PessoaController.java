package com.br.melqui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.br.melqui.model.Pessoa;
import com.br.melqui.service.PessoaService;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

	@Autowired
	private PessoaService service;
	
	@GetMapping("/pessoa")
	public ModelAndView findAll() {
		
		ModelAndView mv = new ModelAndView("/pessoa");
		mv.addObject("pessoa", service.findAll());
		
		return mv;
	}
	
	@GetMapping("/pessoaAdd")
	public ModelAndView add(Pessoa pessoa) {
		
		ModelAndView mv = new ModelAndView("/pessoaAdd");
		mv.addObject("pessoa", pessoa);
		
		return mv;
	}
	
	@GetMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable Long id) {
		
		return add(service.findById(id));
	}
	
	@GetMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable Long id) {
		
		service.delete(id);
		
		return findAll();
	}

	@PostMapping("/save")
	public ModelAndView save(Pessoa pessoa) {
		
		service.save(pessoa);
		
		return findAll();
	}
}
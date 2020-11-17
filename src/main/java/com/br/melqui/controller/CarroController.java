package com.br.melqui.controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.melqui.model.Carro;
import com.br.melqui.repository.CarroRepository;

@RestController
//@RequestMapping
public class CarroController {

	private CarroRepository repository;
	
	    @GetMapping("/signup")
	    public String showSignUpForm(Carro carro) {
	        return "add-carro";
	    }

	    @PostMapping("/addcarro")
	    public String addUser(Carro carro, BindingResult result, Model model) {
	        if (result.hasErrors()) {
	            return "add-carro";
	        }

	        repository.save(carro);
	        model.addAttribute("carro", repository.findAll());
	        return "index";
	    }
	    
	    @GetMapping("/edit/{id}")
	    public String showUpdateForm(@PathVariable("id") long id, Model model) {
	        Carro carro = repository.findById(id)
	          .orElseThrow(() -> new IllegalArgumentException("Invalid carro Id:" + id));

	        model.addAttribute("carro", carro);
	        return "update-carro";
	    }
	    
	    @PostMapping("/update/{id}")
	    public String updateCarro(@PathVariable("id") long id, Carro carro,
	      BindingResult result, Model model) {
	        if (result.hasErrors()) {
	            carro.setId(id);
	            return "update-carro";
	        }

	        repository.save(carro);
	        model.addAttribute("carro", repository.findAll());
	        return "index";
	    }

	    @GetMapping("/delete/{id}")
	    public String deleteCarro(@PathVariable("id") long id, Model model) {
	        Carro carro = repository.findById(id)
	          .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
	        repository.delete(carro);
	        model.addAttribute("carro", repository.findAll());
	        return "index";
	    }
}
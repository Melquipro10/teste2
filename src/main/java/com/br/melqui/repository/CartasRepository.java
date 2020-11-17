package com.br.melqui.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.melqui.model.Cartas;

@Repository
public interface CartasRepository extends CrudRepository<Cartas, Long>{

}

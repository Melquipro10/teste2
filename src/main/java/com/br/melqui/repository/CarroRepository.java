package com.br.melqui.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.melqui.model.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long>{

}

package com.br.melqui.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cartas")
public class Cartas {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String nome;
	
	@Column
	private String magica;
	
	@Column
	private String armadilha;
	
	@Column
	private String monstro;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMagica() {
		return magica;
	}

	public void setMagica(String magica) {
		this.magica = magica;
	}

	public String getArmadilha() {
		return armadilha;
	}

	public void setArmadilha(String armadilha) {
		this.armadilha = armadilha;
	}

	public String getMonstro() {
		return monstro;
	}

	public void setMonstro(String monstro) {
		this.monstro = monstro;
	}
	
}

package com.wprotheus.pbw2.model.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Produto implements Serializable
{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;
	private Double valor;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getDescricao()
	{
		return descricao;
	}

	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}

	public Double getValor()
	{
		return valor;
	}

	public void setValor(Double valor)
	{
		this.valor = valor;
	}
}
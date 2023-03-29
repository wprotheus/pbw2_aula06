package com.wprotheus.pbw2.model.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import java.io.Serializable;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo")
//@Inheritance(strategy = InheritanceType.JOINED)
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Pessoa implements Serializable
{
	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "inc")
//	@GenericGenerator(name = "inc", strategy = "increment")
	@GeneratedValue
	private Long id;
	private String nome;

	@OneToMany(mappedBy = "pessoa")
	private List<Venda> vendas;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public List<Venda> getVendas()
	{
		return vendas;
	}

	public void setVendas(List<Venda> vendas)
	{
		this.vendas = vendas;
	}
}
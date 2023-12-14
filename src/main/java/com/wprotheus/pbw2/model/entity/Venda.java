package com.wprotheus.pbw2.model.entity;

import jakarta.persistence.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Scope("session")
@Component
@Entity
public class Venda implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private LocalDate data = LocalDate.now();

	@OneToMany(mappedBy = "venda")
	private List<ItemVenda> itemVendaList = new ArrayList<ItemVenda>();

	@ManyToOne
	private Pessoa pessoa;

	public double totalVendas()
	{
		double totalVenda=0;
		for (ItemVenda item : itemVendaList)
		{
			totalVenda += item.totalVendaItem();
		}
		return totalVenda;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public LocalDate getData()
	{
		return data;
	}

	public void setData(LocalDate data)
	{
		this.data = data;
	}

	public List<ItemVenda> getItemVendaList()
	{
		return itemVendaList;
	}

	public void setItemVendaList(List<ItemVenda> itemVendaList)
	{
		this.itemVendaList = itemVendaList;
	}

	public Pessoa getPessoa()
	{
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa)
	{
		this.pessoa = pessoa;
	}
}
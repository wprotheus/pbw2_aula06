package com.wprotheus.pbw2.model.entity;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Entity
@Component
public class ItemVenda implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Double quantidade;

	@OneToOne
	private Produto produto;

	@ManyToOne
	private Venda venda;

	public double totalVendaItem()
	{
		double valorVendaItem=0;
		valorVendaItem = this.quantidade * produto.getValor();
		return valorVendaItem;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public Double getQuantidade()
	{
		return quantidade;
	}

	public void setQuantidade(Double quantidade)
	{
		this.quantidade = quantidade;
	}

	public Produto getProduto()
	{
		return produto;
	}

	public void setProduto(Produto produto)
	{
		this.produto = produto;
	}

	public Venda getVenda()
	{
		return venda;
	}

	public void setVenda(Venda venda)
	{
		this.venda = venda;
	}
}
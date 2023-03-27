package com.wprotheus.pbw2.model.repository;

import com.wprotheus.pbw2.model.entity.Venda;
import jakarta.persistence.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VendasRepository
{
	@PersistenceContext
	private EntityManager em;

	public List<Venda> vendaList()
	{
		Query query = em.createQuery("from Venda");
		return query.getResultList();
	}

	public Venda venda(Long id)
	{
		return em.find(Venda.class, id);
	}

	public void save(Venda venda)
	{
		em.persist(venda);
	}

	public void update(Venda venda)
	{
		em.merge(venda);
	}

	public void remove(Long id)
	{
		Venda v = em.find(Venda.class, id);
		em.remove(v);
	}
}
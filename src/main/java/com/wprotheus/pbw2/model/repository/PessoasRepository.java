package com.wprotheus.pbw2.model.repository;

import com.wprotheus.pbw2.model.entity.Pessoa;
import jakarta.persistence.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PessoasRepository
{
	@PersistenceContext
	private EntityManager em;

//	public List<Pessoa> pessoaList()
//	{
//		Query query = em.createQuery("from Pessoa");
//		return query.getResultList();
//	}
	public List<Pessoa> pessoaListCpf()
	{
		Query query = em.createQuery("from PessoaFisica");
		return query.getResultList();
	}
	public List<Pessoa> pessoaListCnpj()
	{
		Query query = em.createQuery("from PessoaJuridica ");
		return query.getResultList();
	}
}
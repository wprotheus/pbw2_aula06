package com.wprotheus.pbw2.model.entity;

import jakarta.persistence.*;

@Entity
//@DiscriminatorValue("J")
public class PessoaJuridica extends Pessoa
{
	private String cnpj; //	CNPJ: (^\d{2}.\d{3}.\d{3}/\d{4}-\d{2}$)

	public String getCnpj()
	{
		return cnpj;
	}

	public void setCnpj(String cnpj)
	{
		this.cnpj = cnpj;
	}
}
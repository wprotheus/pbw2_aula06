package com.wprotheus.pbw2.model.entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Entity
@Component
@DiscriminatorValue("F")
//@PrimaryKeyJoinColumn(name = "pessoa_id")
public class PessoaFisica extends Pessoa
{
	private String cpf;  //	CPF: (^\d{3}\x2E\d{3}\x2E\d{3}\x2D\d{2}$)

	public String getCpf()
	{
		return cpf;
	}

	public void setCpf(String cpf)
	{
		this.cpf = cpf;
	}
}
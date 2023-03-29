package com.wprotheus.pbw2.control;

import com.wprotheus.pbw2.model.repository.PessoasRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Transactional
@Controller
@RequestMapping("pessoas")
public class PessoasController
{
	@Autowired
	PessoasRepository pessoasRepository;

//	@GetMapping("/list")
//	public ModelAndView listar(ModelMap model)
//	{
//		model.addAttribute("pessoas", pessoasRepository.pessoaList());
//		model.addAttribute("titulo", "Lista de Todas as Pessoas");
//		model.addAttribute("tabela", "all");
//		return new ModelAndView("/pessoa/list", model);
//	}

	@GetMapping("/juridicas")
	public ModelAndView listarCnpj(ModelMap model)
	{
		model.addAttribute("juridicas", pessoasRepository.pessoaListCnpj());
		model.addAttribute("titulo", "Lista de Pessoas Jurídicas");
		model.addAttribute("tabela", "pj");
		return new ModelAndView("/pessoa/list", model);
	}

	@GetMapping("/fisicas")
	public ModelAndView listarCpf(ModelMap model)
	{
		model.addAttribute("fisicas", pessoasRepository.pessoaListCpf());
		model.addAttribute("titulo", "Lista de Pessoas Físicas");
		model.addAttribute("tabela", "pf");
		return new ModelAndView("/pessoa/list", model);
	}
}
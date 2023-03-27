package com.wprotheus.pbw2.control;

import com.wprotheus.pbw2.model.entity.Venda;
import com.wprotheus.pbw2.model.repository.VendasRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Transactional
@Controller
@RequestMapping("vendas")
public class VendasController
{
	@Autowired
	VendasRepository vendasRepository;

	@GetMapping("/list")
	public ModelAndView listar(ModelMap model)
	{
		model.addAttribute("vendas", vendasRepository.vendaList());
		model.addAttribute("titulo", "Lista das Vendas");
		return new ModelAndView("/venda/list", model);
	}

	@GetMapping("/form")
	public String form(Venda venda)
	{
		return "/venda/form";
	}

	@GetMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable("id") Long id, ModelMap model)
	{
		model.addAttribute("venda", vendasRepository.venda(id));
		return new ModelAndView("/venda/form", model);
	}

	@GetMapping("/remove/{id}")
	public ModelAndView remove(@PathVariable("id") Long id)
	{
		vendasRepository.remove(id);
		return new ModelAndView("redirect:/vendas/list");
	}

	@PostMapping("/save")
	public String save(Venda venda)
	{
		vendasRepository.save(venda);
		return "redirect:/vendas/list";
	}

	@PostMapping("/update")
	public ModelAndView update(Venda venda)
	{
		vendasRepository.update(venda);
		return new ModelAndView("redirect:/vendas/list");
	}
}
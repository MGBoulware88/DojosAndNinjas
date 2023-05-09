package com.gray.dojos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gray.dojos.models.Dojo;
import com.gray.dojos.models.Ninja;
import com.gray.dojos.services.DojoService;
import com.gray.dojos.services.NinjaService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/ninjas")
public class NinjaController {
	@Autowired
	NinjaService ninjaService;
	@Autowired
	DojoService dojoService;

	@GetMapping("/new")
	public String newNinjaForm(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> allDojos = dojoService.findAllDojos();
		model.addAttribute("allDojos", allDojos);
		return "ninjas/newNinja.jsp";
	}
		
	@PostMapping("/create")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		if (result.hasErrors()) {
			List<Dojo> allDojos = dojoService.findAllDojos();
			model.addAttribute("allDojos", allDojos);
			model.addAttribute("ninja", ninja);
			return "ninjas/newNinja.jsp";
		}
		ninjaService.createNinja(ninja);
		return "redirect:/ninjas/new";
	}
}

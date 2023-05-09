package com.gray.dojos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.gray.dojos.models.Dojo;
import com.gray.dojos.services.DojoService;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/dojos")
public class DojoController {
	@Autowired
	DojoService dojoService;
	
	@GetMapping("")
	public String newDojoForm(@ModelAttribute("dojo") Dojo dojo) {
		return "dojos/newDojo.jsp";
	}
	
	@PostMapping("/create")
	public String createNewDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("dojo", dojo);
			return "dojos/newDojo.jsp";
		}
		dojoService.createDojo(dojo);
		return "redirect:/dojos";
	}

	@GetMapping("/{dojoId}")
	public String showDojoAndNinjas(@PathVariable("dojoId") Long dojoId, Model model) {
		Dojo dojo = dojoService.findDojo(dojoId);
		model.addAttribute("dojo", dojo);
		return "/dojos/showDojo.jsp";
	}
}

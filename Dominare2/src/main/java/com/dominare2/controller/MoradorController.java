package com.dominare2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.dominare2.model.MoradorRepository;
import com.dominare2.model.Morador;

@Controller
public class MoradorController {

    @Autowired
    private MoradorRepository repository;

    @GetMapping({"/", "/lista"})
    public String listarMoradores(Model model) {
        model.addAttribute("moradores", repository.findAll());
        return "lista";
    }

    @GetMapping("/cadastro")
    public String mostrarFormulario(Model model) {
        model.addAttribute("morador", new Morador());
        return "cadastro";
    }

    @PostMapping("/cadastro")
    public String cadastrar(Morador morador) {
        repository.save(morador);
        return "redirect:/";
    }

}

package com.dominare2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.dominare2.model.VisitanteRepository;
import com.dominare2.model.Visitante;

@Controller
public class VisitanteController {

    @Autowired
    private VisitanteRepository repository;

    @GetMapping({"/lista_visitante"})
    public String listarVisitantes(Model model) {
        model.addAttribute("visitantes", repository.findAll());
        return "lista_visitante";
    }

    @GetMapping("/cadastro_visitante")
    public String mostrarFormulario(Model model) {
        model.addAttribute("visitante", new Visitante());
        return "cadastro_visitante";
    }

    @PostMapping("/cadastro_visitante")
    public String cadastrar(Visitante visitante) {
        repository.save(visitante);
        return "redirect:/";
    }

}

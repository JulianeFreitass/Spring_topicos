package br.gov.sp.fatec.springtopicos20231.controller;


import br.gov.sp.fatec.springtopicos20231.entity.Trabalho;
import br.gov.sp.fatec.springtopicos20231.service.ITrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/trabalho")
public class TrabalhoController {

    @Autowired
    private ITrabalhoService service;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public Trabalho novoTrabalho(@RequestBody Trabalho trabalho) {
        return service.novoTrabalho(trabalho);
    }

    @GetMapping
    public List<Trabalho> buscarTodosTrabalhos(){
        return service.buscarTodosTrabalhos();
    }

    @GetMapping(value = "/id/{trabalho}")
    public Trabalho buscarPorId(@PathVariable("trabalho") Long id){
        return service.buscarPorId(id);
    }
}

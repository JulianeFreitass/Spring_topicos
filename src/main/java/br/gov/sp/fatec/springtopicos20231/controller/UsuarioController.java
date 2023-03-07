package br.gov.sp.fatec.springtopicos20231.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.springtopicos20231.entity.Usuario;
import br.gov.sp.fatec.springtopicos20231.service.UsuarioService;

@RestController
@CrossOrigin
@RequestMapping(value ="/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @PostMapping
    public Usuario novoUsuario(Usuario usuario){
        return service.novoUsuario(usuario);
    }
    @GetMapping
    public List<Usuario> buscarTodosUsuarios(){
        return service.buscarTodosUsuarios();
    }
    @GetMapping(value = "id/{usuario}")
    public Usuario buscarPorId(@PathVariable("usuario") Long id){
        return service.buscarPorId(id);
    }

}

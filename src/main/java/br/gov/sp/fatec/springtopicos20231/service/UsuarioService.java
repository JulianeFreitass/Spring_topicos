package br.gov.sp.fatec.springtopicos20231.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.springtopicos20231.entity.Usuario;
import br.gov.sp.fatec.springtopicos20231.repository.UsuarioRespository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRespository UsuarioRepo;

    public Usuario novoUsuario(Usuario usuario) {
        if (usuario == null
                || usuario.getNome() == null
                || usuario.getSenha() == null) {
            throw new IllegalArgumentException("usuario e senha invalidos");
        }
        return UsuarioRepo.save(usuario);
    }

    public List<Usuario> buscarTodosUsuarios() {
        return UsuarioRepo.findAll();
    }

    public Usuario buscarPorId(long id) {
       Optional<Usuario> usuarioOp =  UsuarioRepo.findById(id);

       if(usuarioOp.isEmpty()){
        throw new IllegalArgumentException("Usuário não existe");
       }
       return usuarioOp.get();
    }

}
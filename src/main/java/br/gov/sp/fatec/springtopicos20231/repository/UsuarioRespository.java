package br.gov.sp.fatec.springtopicos20231.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.springtopicos20231.entity.Usuario;

public interface UsuarioRespository extends JpaRepository<Usuario, Long> {
    
}
